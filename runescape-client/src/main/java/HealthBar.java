import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("bc")
	@Export("otp")
	static String otp;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lfv;")

	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Llk;")

	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(descriptor = 
	"(Lfv;)V")

	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque();
		this.definition = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IIIIB)V", garbageValue = 
	"-72")

	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null;
		int var6 = 0;

		for (HealthBarUpdate var7 = ((HealthBarUpdate) (this.updates.last())); var7 != null; var7 = ((HealthBarUpdate) (this.updates.previous()))) {
			++var6;
			if (var7.cycle == var1) {
				var7.set(var1, var2, var3, var4);
				return;
			}

			if (var7.cycle <= var1) {
				var5 = var7;
			}
		}

		if (var5 == null) {
			if (var6 < 4) {
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
			if (var6 >= 4) {
				this.updates.last().remove();
			}

		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(II)Lcp;", garbageValue = 
	"675782761")

	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = ((HealthBarUpdate) (this.updates.last()));
		if ((var2 != null) && (var2.cycle <= var1)) {
			for (HealthBarUpdate var3 = ((HealthBarUpdate) (this.updates.previous())); (var3 != null) && (var3.cycle <= var1); var3 = ((HealthBarUpdate) (this.updates.previous()))) {
				var2.remove();
				var2 = var3;
			}

			if (((this.definition.int5 + var2.cycleOffset) + var2.cycle) > var1) {
				return var2;
			} else {
				var2.remove();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"-107")

	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method6164();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(IB)I", garbageValue = 
	"-31")

	public static int method2344(int var0) {
		return class400.field4389[var0 & 16383];
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"1491549945")

	static int method2343(int var0, Script var1, boolean var2) {
		if (var0 == 6800) {
			Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
			return 1;
		} else if ((var0 != 6801) && (var0 != 6802)) {
			if (var0 == 6850) {
				Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
				return 1;
			} else if ((var0 != 6851) && (var0 != 6852)) {
				if (var0 == 6853) {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
				return 1;
			}
		} else {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
			return 1;
		}
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(descriptor = 
	"(IIIII)V", garbageValue = 
	"-1357746428")

	static final void method2330(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (((((Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4]) > var0) && (Client.rootWidgetXs[var4] < (var0 + var2))) && ((Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4]) > var1)) && (Client.rootWidgetYs[var4] < (var3 + var1))) {
				Client.field715[var4] = true;
			}
		}

	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(descriptor = 
	"(IIB)V", garbageValue = 
	"-66")

	static final void method2328(int var0, int var1) {
		ClanChannel var2 = (var0 >= 0) ? Client.currentClanChannels[var0] : class21.guestClanChannel;
		if (((var2 != null) && (var1 >= 0)) && (var1 < var2.method3119())) {
			ClanChannelMember var3 = ((ClanChannelMember) (var2.members.get(var1)));
			if (var3.rank == (-1)) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2900, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + class425.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}