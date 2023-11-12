/*
 * Copyright (c) 2023, Kyle Escobar <https://github.com/runebox>
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
import java.util.List;
import java.util.stream.Collectors;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Field;
import net.runelite.asm.Method;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.instructions.LDC;
import net.runelite.asm.signature.Signature;
import net.runelite.deob.DeobProperties;
import net.runelite.deob.Transformer;
import net.runelite.deob.deobfuscators.Renamer;
import net.runelite.deob.util.JarUtil;
import net.runelite.deob.util.NameMappings;

public class BufferRenameTransformer implements Transformer
{
	private static final Logger logger = LoggerFactory.getLogger(BufferRenameTransformer.class);

	@Override
	public void transform(ClassGroup group)
	{
		ClassGroup namedGroup = JarUtil.load(DeobProperties.getRsClient());
		namedGroup.buildClassGraph();
		namedGroup.lookup();

		ClassFile namedBufferCF = namedGroup.findClass("Buffer");
		ClassFile targetBufferCF = null;

		// Find buffer class
		top:
		for (ClassFile classFile : group)
		{
			Method clinit = classFile.findMethod("<clinit>", new Signature("()V"));
			if (clinit == null) continue;
			if (clinit.getCode() == null) continue;
			if (clinit.getCode().getInstructions() == null) continue;
			for (Instruction insn : clinit.getCode().getInstructions().getInstructions())
			{
				if (insn instanceof LDC)
				{
					if (((LDC) insn).getConstant() instanceof Long && ((LDC) insn).getConstantAsLong() == -3932672073523589310L)
					{
						targetBufferCF = classFile;
						break top;
					}
				}
			}
		}

		final NameMappings mappings = new NameMappings();
		mappings.map(targetBufferCF.getPoolClass(), namedBufferCF.getName());

		// Map fields
		List<Field> namedFields = namedBufferCF.getFields();
		List<Field> targetFields = targetBufferCF.getFields();
		for (int i = 0; i < namedFields.size(); i++)
		{
			Field namedField = namedFields.get(i);
			Field targetField = targetFields.get(i);
			if (namedField.getName().startsWith("field"))
			{
				continue;
			}
			mappings.map(targetField.getPoolField(), namedField.getName());
		}

		// Map methods
		List<Method> namedMethods = namedBufferCF.getMethods().stream()
			.filter(m -> !m.isStatic())
			.filter(m -> !m.getName().equals("<clinit>"))
			.filter(m -> !m.getName().equals("<init>"))
			//.filter(m -> m.getCode() != null)
			.collect(Collectors.toList());

		List<Method> targetMethods = targetBufferCF.getMethods().stream()
			.filter(m -> !m.isStatic())
			.filter(m -> !m.getName().equals("<clinit>"))
			.filter(m -> !m.getName().equals("<init>"))
			//.filter(m -> m.getCode() != null)
			.collect(Collectors.toList());

		// Fix buffer index, compare and find where a method got added/deleted
		// Add a dummy method or remove a method at index
		if (targetMethods.size() != namedMethods.size())
		{
			logger.warn("Buffer index fix required!");
			logger.warn("targetMethodSize: {} != namedMethodSize: {}", targetMethods.size(), namedMethods.size());
			//namedMethods.add(70, new Method(namedBufferCF, "methodRePosition", new Signature("()V")));
			//namedMethods.remove(70);
		}

		for (int i = 0; i < Math.min(namedMethods.size(), targetMethods.size()); i++)
		{
			net.runelite.asm.pool.Method targetMethod = targetMethods.get(i).getPoolMethod();
			net.runelite.asm.pool.Method namedMethod = namedMethods.get(i).getPoolMethod();

			if (namedMethod.getName().startsWith("method") && targetMethod.getName().startsWith("method"))
			{
				continue;
			}

			logger.info("Rename: {} -> {} | {}", targetMethod.getName(), namedMethod.getName(), i);
			mappings.map(targetMethod, namedMethod.getName());
		}

		Renamer renamer = new Renamer(mappings);
		renamer.run(group);

		logger.warn("Buffer rename order might have been incorrect verify manually!");
	}
}