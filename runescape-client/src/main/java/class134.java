



import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public class class134 extends class144 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-890090541)

	int field1558;
	@ObfuscatedName("c")
	byte field1557;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-1576822887)

	int field1559;
	@ObfuscatedName("f")
	String field1560;

	@ObfuscatedSignature(descriptor = 
	"Ler;")

	final class145 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Ler;)V")

	class134(class145 var1) {
		this.this$0 = var1;
		this.field1558 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;B)V", garbageValue = 
	"23")

	void vmethod3152(Buffer var1) {
		this.field1558 = var1.readUnsignedShort();
		this.field1557 = var1.readByte();
		this.field1559 = var1.readUnsignedShort();
		var1.readLong();
		this.field1560 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lea;I)V", garbageValue = 
	"1764669808")

	void vmethod3153(ClanChannel var1) {
		ClanChannelMember var2 = ((ClanChannelMember) (var1.members.get(this.field1558)));
		var2.rank = this.field1557;
		var2.world = this.field1559;
		var2.username = new Username(this.field1560);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lfb;", garbageValue = 
	"6")

	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = ((VarpDefinition) (VarpDefinition.VarpDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(CI)Z", garbageValue = 
	"-939584832")

	public static boolean method2905(char var0) {
		if (((var0 <= 0) || (var0 >= 128)) && ((var0 < 160) || (var0 > 255))) {
			if (var0 != 0) {
				char[] var1 = class345.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZS)I", garbageValue = 
	"300")

	static int method2906(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		} else {
			var3 = (var2) ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget;
		}

		class346.invalidateWidget(var3);
		if (((var0 != ScriptOpcodes.CC_SETOBJECT) && (var0 != ScriptOpcodes.CC_SETOBJECT_NONUM)) && (var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM)) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = GrandExchangeEvents.localPlayer.appearance.getChatHeadId();
				return 1;
			} else {
				return 2;
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 2;
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = class19.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if ((var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) | (1 == var6.isStackable)) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field3467 > 0) {
				var3.modelZoom = (var3.modelZoom * 32) / var3.field3467;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = (var3.modelZoom * 32) / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-77")

	static void method2908() {
		Client.packetWriter.addNode(WorldMapSprite.getPacketBufferNode(ClientPacket.field2989, Client.packetWriter.isaacCipher));
		Client.oculusOrbState = 0;
	}
}