import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("dy")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("un")
	@ObfuscatedSignature(descriptor = "Llg;")
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Lqr;")
	static Buffer field1385;

	@ObfuscatedName("s")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lnt;Lnt;I)I", garbageValue = "404985625")
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) {
			return this.reversed ? var1.world - var2.world : var2.world - var1.world;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)[Li;", garbageValue = "-1307073800")
	public static class6[] method2583() {
		return new class6[]{ class6.field19 };
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "-97")
	static final void method2582(String var0) {
		PacketBufferNode var1 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2946, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class309.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(descriptor = "(ILbz;ZI)I", garbageValue = "-2013251385")
	static int method2575(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) {
			User.Interpreter_intStackSize -= 5;
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7204) {
			User.Interpreter_intStackSize -= 6;
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7205 && var0 < 7209) {
			Interpreter.Interpreter_intStack[User.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7209) {
			User.Interpreter_intStackSize -= 2;
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7210 && var0 < 7214) {
			--User.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7214) {
			User.Interpreter_intStackSize -= 2;
			return 1;
		} else {
			return 2;
		}
	}
}