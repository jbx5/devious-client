/*
 * Copyright (c) 2023, Melxin <https://github.com/melxin>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.deob.deobfuscators.mapping;

import com.google.common.base.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import net.runelite.asm.Annotation;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Field;
import net.runelite.asm.Method;
import net.runelite.asm.Type;
import net.runelite.deob.DeobAnnotations;

/**
 * Attempt to map missing fields and methods based on order
 */
public class MissingMappingChecker implements Runnable
{
	private static final Logger logger = LoggerFactory.getLogger(MissingMappingChecker.class);

	private ParallelExecutorMapping mapping;
	private final ClassGroup namedGroup;
	private final ClassGroup targetGroup;

	public MissingMappingChecker(ParallelExecutorMapping mapping, ClassGroup group1, ClassGroup group2)
	{
		this.mapping = mapping;
		this.namedGroup = group1;
		this.targetGroup = group2;
	}

	@Override
	public void run()
	{
		Stopwatch stopwatch = Stopwatch.createStarted();

		// Fix missing named class mapping
		for (Object key : mapping.getMap().keySet())
		{
			ClassFile namedCF = null;
			ClassFile targetCF = null;

			if (key instanceof Field)
			{
				namedCF = ((Field) key).getClassFile();
				targetCF = ((Field) mapping.getMap().get(key)).getClassFile();
			}
			else if (key instanceof Method)
			{
				namedCF = ((Method) key).getClassFile();
				targetCF = ((Method) mapping.getMap().get(key)).getClassFile();
			}

			if (namedCF == null || targetCF == null || namedCF.getName().startsWith("RuneLite") || namedCF.getName().startsWith("class"))
			{
				continue;
			}

			if (!mapping.getMap().containsKey(namedCF))
			{
				if (namedCF.getName().equals("FillMode"))
				{
					Field targetFillModeField = (Field) mapping.getMap().entrySet().stream().filter(e -> e.getKey().toString().equals("static LFillMode; FillMode.SOLID")).map(Map.Entry::getValue).findFirst().orElse(null);
					if (targetFillModeField != null)
					{
						mapping.map(null, namedCF, targetFillModeField.getClassFile());
						logger.info("Mapped missing class: {} to: {}", namedCF, targetFillModeField.getClassFile());
						continue;
					}
				}
				mapping.map(null, namedCF, targetCF);
				logger.info("Mapped missing class: {} to: {}", namedCF, targetCF);
			}
		}

		// Fix missing named fields and methods mapping
		for (ClassFile namedCF : namedGroup)
		{
			// Fix duplicate/incorrect named field exports
			// this is so it does not duplicate field names which is difficult to change manually
			// this for example happened with viewportTempX and viewportTempY where viewportTempY was annotated viewportTempX by human error and the mapper causing it to duplicate
			// the export should match the field name
			List<Field> namedFields = namedCF.getFields();
			for (Field nf : namedFields)
			{
				if (nf.getAnnotations() != null && !nf.getAnnotations().isEmpty() && nf.getAnnotations().containsKey(DeobAnnotations.EXPORT))
				{
					Annotation exportAnnotation = nf.getAnnotations().get(DeobAnnotations.EXPORT);
					String exportAnnotationValueString = exportAnnotation.getValueString();
					if (!exportAnnotationValueString.equals(nf.getName()))
					{
						logger.error("Incorrect export annotation value: {} != {} field: {} changing to: {}", exportAnnotationValueString, nf.getName(), nf, nf.getName());
						exportAnnotation.setElement(nf.getName());
					}
				}
			}
			//

			ClassFile targetCF = (ClassFile) mapping.getMap().get(namedCF);
			if (targetCF != null)
			{
				checkMissing(namedCF, targetCF);
				continue;
			}

			for (ClassFile cf2 : targetGroup)
			{
				if (!MappingExecutorUtil.isMaybeEqual(namedCF, cf2))
				{
					continue;
				}

				if (new ClassMapper(namedCF, cf2).same())
				{
					checkMissing(namedCF, cf2);
				}
			}
		}

		// Fix updateLoginState mapping
		Method namedUpdateLoginState = namedGroup.findStaticMethod("updateLoginState");
		Field targetStaticLoginState = (Field) mapping.getMap().entrySet().stream().filter(e -> e.getKey().toString().contains("static LLoginState;")).map(Map.Entry::getValue).findFirst().orElse(null);
		if (namedUpdateLoginState != null && targetStaticLoginState != null)
		{
			for (ClassFile targetCF : targetGroup)
			{
				Method targetUpdateLoginState = targetCF.getMethods().stream()
					.filter(m -> m.isStatic() && !mapping.getMap().containsValue(m) && m.getDescriptor().toString().equals("(L" + targetStaticLoginState.getClassFile().getName() + ";)V"))
					.findFirst()
					.orElse(null);

				if (targetUpdateLoginState != null)
				{
					mapping.map(null, namedUpdateLoginState, targetUpdateLoginState);
					logger.info("Mapped missing method: {} to: {}", namedUpdateLoginState, targetUpdateLoginState);
					break;
				}
			}
		}

		logger.info("Took: {}", stopwatch);
	}

	/**
	 * Check for missing field and method names
	 *
	 * @param namedCF
	 * @param targetCF
	 */
	private void checkMissing(ClassFile namedCF, ClassFile targetCF)
	{
		if (namedCF == null || targetCF == null)
		{
			return;
		}

		Type lastNamedType = null;
		Type lastTargetType = null;

		Type nextNamedType = null;
		Type nextTargetType = null;

		List<Field> namedFields = namedCF.getFields().stream().filter(f -> f.getAnnotations().containsKey(DeobAnnotations.EXPORT) && !mapping.getMap().containsKey(f)).collect(Collectors.toList());
		List<Field> targetFields = targetCF.getFields().stream().filter(f -> !f.getAnnotations().containsKey(DeobAnnotations.EXPORT) && !mapping.getMap().containsValue(f)).collect(Collectors.toList());
		for (int i = 0; i < namedFields.size(); i++)
		{
			Field namedField = namedFields.get(i);
			for (int j = 0; j < targetFields.size(); j++)
			{
				Field targetField = targetFields.get(j);
				if (namedField.getType().equals(targetField.getType()) || namedField.getType().equals(new Type("L" + namedField.getClassFile().getName() + ";")) && targetField.getType().equals(new Type("L" + targetField.getClassFile().getName() + ";")))
				{
					if (namedField.getAccessFlags() == targetField.getAccessFlags())
					{
						if (lastNamedType != null && lastTargetType != null && !lastNamedType.equals(lastTargetType))
						{
							continue;
						}

						if (nextNamedType != null && nextTargetType != null && !nextNamedType.equals(nextTargetType))
						{
							continue;
						}

						if (mapping.getMap().containsValue(targetField))
						{
							continue;
						}

						mapping.map(null, namedField, targetField);
						logger.info("Mapped missing field: {} to: {}", namedField, targetField);
					}
				}
				lastTargetType = targetField.getType();
				nextTargetType = j + 1 < targetFields.size() ? targetFields.get(j + 1).getType() : null;
			}
			lastNamedType = namedField.getType();
			nextNamedType = i + 1 < namedFields.size() ? namedFields.get(i + 1).getType() : null;
		}

		List<Method> namedMethods = namedCF.getMethods().stream().filter(m -> m.getAnnotations().containsKey(DeobAnnotations.EXPORT) && !m.getName().equals("<clinit>") && !m.getName().equals("<init>") && !mapping.getMap().containsKey(m)).collect(Collectors.toList());
		List<Method> targetMethods = targetCF.getMethods().stream().filter(m -> !m.getAnnotations().containsKey(DeobAnnotations.EXPORT) && !m.getName().equals("<clinit>") && !m.getName().equals("<init>") && !mapping.getMap().containsValue(m)).collect(Collectors.toList());
		for (int i = 0; i < namedMethods.size(); i++)
		{
			Method namedMethod = namedMethods.get(i);
			String namedMethodWithClass = namedMethod.getDescriptor().toString().contains("L") ? namedMethod.getDescriptor().toString().substring(namedMethod.getDescriptor().toString().lastIndexOf("L"), namedMethod.getDescriptor().toString().lastIndexOf(";") + 1) : null;

			for (int j = 0; j < targetMethods.size(); j++)
			{
				Method targetMethod = targetMethods.get(j);
				String targetMethodWithClass = targetMethod.getDescriptor().toString().contains("Lclass") ? targetMethod.getDescriptor().toString().substring(targetMethod.getDescriptor().toString().lastIndexOf("L"), targetMethod.getDescriptor().toString().lastIndexOf(";") + 1) : null;

				if (namedMethod.getDescriptor().equals(targetMethod.getDescriptor())
					|| namedMethod.getDescriptor().toString().replace(namedMethod.getClassFile().getName(), targetMethod.getClassFile().getName()).equals(targetMethod.getDescriptor().toString())
					|| namedMethodWithClass != null && targetMethodWithClass != null && namedMethod.getDescriptor().toString().replace(namedMethodWithClass, targetMethodWithClass).equals(targetMethod.getDescriptor().toString()))
				{
					if (namedMethod.getAccessFlags() == targetMethod.getAccessFlags() && namedMethod.getParameters().equals(targetMethod.getParameters()))
					{
						if (mapping.getMap().containsValue(targetMethod))
						{
							continue;
						}

						mapping.map(null, namedMethod, targetMethod);
						logger.info("Mapped missing method: {} to: {}", namedMethod, targetMethod);
						break;
					}
				}
			}
		}
	}
}
