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

import org.objectweb.asm.Opcodes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Field;
import net.runelite.asm.Method;
import net.runelite.asm.Type;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instructions.ALoad;
import net.runelite.asm.attributes.code.instructions.IConst_0;
import net.runelite.asm.attributes.code.instructions.ILoad;
import net.runelite.asm.attributes.code.instructions.InvokeSpecial;
import net.runelite.asm.attributes.code.instructions.VReturn;
import net.runelite.asm.signature.Signature;
import net.runelite.deob.Transformer;

/**
 * Fix the wrongly de-obfuscated enum constructor where a final int field is not initialized
 */
public class BadEnumConstructorTransformer implements Transformer
{
	private static final Logger logger = LoggerFactory.getLogger(BadEnumConstructorTransformer.class);

	@Override
	public void transform(ClassGroup group)
	{
		for (ClassFile cf : group.getClasses())
		{
			Map<Signature, Method> multiInit = cf.getMethods().stream().filter(m -> m.getDescriptor().equals(new Signature("(Ljava/lang/String;II)V")) || m.getDescriptor().equals(new Signature("(Ljava/lang/String;IIZ)V"))).collect(Collectors.toMap(Method::getDescriptor, Function.identity()));
			if (multiInit.size() > 1)
			{
				List<Field> fields = cf.getFields().stream().filter(f -> (f.getAccessFlags() & Opcodes.ACC_FINAL) == Opcodes.ACC_FINAL && f.getType().equals(new Type("I"))).collect(Collectors.toList());
				if (fields.size() == 1)
				{
					Field targetFinalIntField = fields.get(0);

					Method targetInitMethod = multiInit.get(new Signature("(Ljava/lang/String;II)V"));
					Code targetInitMethodCode = new Code(targetInitMethod);
					targetInitMethod.setCode(targetInitMethodCode);

					Instructions instructions = targetInitMethodCode.getInstructions();
					List<Instruction> ins = instructions.getInstructions();

					/**
					 * Initialize the other constructor which sets the final int field same as vanilla does
					 */
					ins.add(0, new ALoad(instructions, 0));
					ins.add(1, new ALoad(instructions, 1));
					ins.add(2, new ILoad(instructions, 2));
					ins.add(3, new ILoad(instructions, 3));
					ins.add(4, new IConst_0(instructions));
					ins.add(5, new InvokeSpecial(instructions, multiInit.get(new Signature("(Ljava/lang/String;IIZ)V")).getPoolMethod()));
					ins.add(6, new VReturn(instructions));

					logger.info("Transformed enum class constructor: {} to invoke: {} to initialize field: {}", targetInitMethod.getPoolMethod(), multiInit.get(new Signature("(Ljava/lang/String;IIZ)V")).getPoolMethod(), targetFinalIntField.getPoolField());

					/**
					 * Initialize final field in enum constructor
					 */
					/*ins.add(0, new ALoad(instructions, 0));
					ins.add(1, new ALoad(instructions, 1));
					ins.add(2, new ILoad(instructions, 2));
					ins.add(3, new InvokeSpecial(instructions, new net.runelite.asm.pool.Method(new net.runelite.asm.pool.Class("java/lang/Enum"), "<init>", new Signature("(Ljava/lang/String;I)V"))));

					ins.add(4, new ALoad(instructions, 0));
					ins.add(5, new ILoad(instructions, 3));
					ins.add(6, new PutField(instructions, targetFinalIntField.getPoolField()));
					ins.add(7, new VReturn(instructions));*/

					return;
				}
			}
		}
	}
}
