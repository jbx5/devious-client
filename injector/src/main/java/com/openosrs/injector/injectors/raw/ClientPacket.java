package com.openosrs.injector.injectors.raw;

import com.openosrs.injector.injection.InjectData;
import com.openosrs.injector.injectors.AbstractInjector;
import net.runelite.asm.ClassFile;
import net.runelite.asm.Method;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.InstructionType;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.instructions.Dup;
import net.runelite.asm.attributes.code.instructions.InvokeSpecial;
import net.runelite.asm.attributes.code.instructions.New;
import net.runelite.asm.attributes.code.instructions.Return;
import net.runelite.asm.attributes.code.instructions.SiPush;
import net.runelite.asm.signature.Signature;

public class ClientPacket extends AbstractInjector {
	public ClientPacket(InjectData inject)
	{
		super(inject);
	}

	@Override
	public void inject()
	{
		ClassFile clientPacketVanilla = inject.toVanilla(
				inject.getDeobfuscated()
						.findClass("ClientPacket")
		);

		ClassFile clientVanilla = inject.toVanilla(
				inject.getDeobfuscated()
						.findClass("Client")
		);

		Method getter = new Method(clientVanilla, "getClientPacket", new Signature("()Lnet/runelite/api/packets/ClientPacket;"));
		getter.setPublic();

		final Code code = new Code(getter);
		code.setMaxStack(4);
		getter.setCode(code);
		clientVanilla.addMethod(getter);

		Instructions ins = code.getInstructions();

		ins.addInstruction(new New(ins, clientPacketVanilla.getPoolClass()));
		ins.addInstruction(new Dup(ins));
		ins.addInstruction(new SiPush(ins, (short) 1337));
		ins.addInstruction(new SiPush(ins, (short) 1337));
		ins.addInstruction(new InvokeSpecial(ins, new net.runelite.asm.pool.Method(clientPacketVanilla.getPoolClass(), "<init>", new Signature("(II)V"))));
		ins.addInstruction(new Return(ins, InstructionType.ARETURN));
	}
}
