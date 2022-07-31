package net.runelite.asm.attributes.code.instructions;

import net.runelite.asm.Type;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.InstructionType;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.execution.Frame;
import net.runelite.asm.execution.InstructionContext;
import net.runelite.asm.execution.Stack;
import net.runelite.asm.execution.StackContext;
import net.runelite.asm.execution.Value;

public class IConst_0 extends Instruction
{
	public IConst_0(Instructions instructions, InstructionType type)
	{
		super(instructions, type);
	}

	public IConst_0(Instructions instructions)
	{
		super(instructions, InstructionType.ICONST_0);
	}

	@Override
	public InstructionContext execute(Frame frame)
	{
		InstructionContext ins = new InstructionContext(this, frame);
		Stack stack = frame.getStack();

		StackContext ctx = new StackContext(ins, Type.OBJECT, new Value(0));
		stack.push(ctx);

		ins.push(ctx);

		return ins;
	}
}

