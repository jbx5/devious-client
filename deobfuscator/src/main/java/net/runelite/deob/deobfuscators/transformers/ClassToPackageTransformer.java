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
package net.runelite.deob.deobfuscators.transformers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import net.runelite.asm.Annotation;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Method;
import net.runelite.asm.Type;
import net.runelite.deob.DeobAnnotations;
import net.runelite.deob.DeobProperties;
import net.runelite.deob.Transformer;
import net.runelite.deob.deobfuscators.Renamer;
import net.runelite.deob.util.JarUtil;
import net.runelite.deob.util.NameMappings;

/**
 * Map classes to package, this happens because the mapper maps the class to the implements annotation which does not contain the package name
 */
public class ClassToPackageTransformer implements Transformer
{
	private static final Logger logger = LoggerFactory.getLogger(ClassToPackageTransformer.class);

	private final List<String> renamedClassNames = new ArrayList<>();

	@Override
	public void transform(ClassGroup group)
	{
		ClassGroup vanillaGroup = JarUtil.load(DeobProperties.getVanilla());
		vanillaGroup.buildClassGraph();
		vanillaGroup.lookup();

		final NameMappings mappings = new NameMappings();

		for (ClassFile vanillaCF : vanillaGroup)
		{
			if (vanillaCF.getName().contains("bouncycastle"))
			{
				continue;
			}

			if (vanillaCF.getName().contains("/"))
			{
				ClassFile targetCF = group.findClass(vanillaCF.getName().substring(vanillaCF.getName().lastIndexOf("/") + 1));
				if (targetCF != null)
				{
					logger.info("Mapping class: {} to: {}", targetCF, vanillaCF);
					mappings.map(targetCF.getPoolClass(), vanillaCF.getName());
					renamedClassNames.add(vanillaCF.getName());
				}
			}
		}

		if (!mappings.getMap().isEmpty())
		{
			new Renamer(mappings).run(group);

			for (ClassFile cf : group)
			{
				if (renamedClassNames.contains(cf.getName()))
				{
					removeObfAnnotations(cf);
				}
			}
		}
	}

	private void removeObfAnnotations(ClassFile cf)
	{
		// Remove obfuscated annotations from class
		Map<Type, Annotation> cfAnnotations = cf.getAnnotations();
		cfAnnotations.keySet().stream().filter(k -> k.equals(DeobAnnotations.OBFUSCATED_NAME) || k.equals(DeobAnnotations.OBFUSCATED_SIGNATURE) || k.equals(DeobAnnotations.OBFUSCATED_GETTER)).collect(Collectors.toList()).forEach(cfAnnotations::remove);

		// Remove obfuscated annotations from fields
		for (net.runelite.asm.Field f : cf.getFields())
		{
			Map<Type, Annotation> fieldAnnotations = f.getAnnotations();
			fieldAnnotations.keySet().stream().filter(k -> k.equals(DeobAnnotations.OBFUSCATED_NAME) || k.equals(DeobAnnotations.OBFUSCATED_SIGNATURE) || k.equals(DeobAnnotations.OBFUSCATED_GETTER)).collect(Collectors.toList()).forEach(fieldAnnotations::remove);
		}

		// Remove obfuscated annotations from methods
		for (Method m : cf.getMethods())
		{
			Map<Type, Annotation> methodAnnotations = m.getAnnotations();
			methodAnnotations.keySet().stream().filter(k -> k.equals(DeobAnnotations.OBFUSCATED_NAME) || k.equals(DeobAnnotations.OBFUSCATED_SIGNATURE) || k.equals(DeobAnnotations.OBFUSCATED_GETTER)).collect(Collectors.toList()).forEach(methodAnnotations::remove);
		}
	}
}
