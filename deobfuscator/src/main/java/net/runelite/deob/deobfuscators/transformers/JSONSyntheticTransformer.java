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
import java.util.List;
import net.runelite.asm.ClassFile;
import net.runelite.asm.ClassGroup;
import net.runelite.asm.Method;
import net.runelite.asm.Type;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instructions.Dup;
import net.runelite.asm.attributes.code.instructions.InvokeSpecial;
import net.runelite.asm.attributes.code.instructions.New;
import net.runelite.asm.attributes.code.instructions.PutStatic;
import net.runelite.asm.attributes.code.instructions.VReturn;
import net.runelite.asm.pool.Class;
import net.runelite.asm.pool.Field;
import net.runelite.asm.signature.Signature;
import net.runelite.deob.Transformer;

public class JSONSyntheticTransformer implements Transformer
{
	private static final Logger logger = LoggerFactory.getLogger(JSONSyntheticTransformer.class);

	@Override
	public void transform(ClassGroup group)
	{
		for (ClassFile cf : group)
		{
			if (!cf.getName().startsWith("org/json/"))
			{
				continue;
			}

			// transform clinit method to set NULL field
			if (cf.getName().equals("org/json/JSONObject"))
			{
				Method clinit = cf.findMethod("<clinit>");
				Code code = clinit.getCode();

				Instructions instructions = code.getInstructions();
				List<Instruction> ins = instructions.getInstructions();

				ins.clear();
				ins.add(0, new New(instructions, new Class("org/json/JSONObject$Null")));
				ins.add(1, new Dup(instructions));
				ins.add(2, new InvokeSpecial(instructions, new net.runelite.asm.pool.Method(new Class("org/json/JSONObject$Null"), "<init>", new Signature("()V"))));
				ins.add(3, new PutStatic(instructions, new Field(new Class("org/json/JSONObject"), "NULL", new Type("Ljava/lang/Object;"))));
				ins.add(4, new VReturn(instructions));

				logger.info("Transformed JSONObject <clinit>");
			}

			// Remove synthetic constructor
			if (cf.getName().equals("org/json/JSONObject$Null"))
			{
				Method syntheticInitMethod = cf.findMethod("<init>", new Signature("(Lorg/json/JSONObject$1;)V"));
				if (syntheticInitMethod != null)
				{
					cf.removeMethod(syntheticInitMethod);
					logger.info("Transformed JSONObject$Null removed synthetic method: {}", syntheticInitMethod);
				}
			}
		}
	}
}