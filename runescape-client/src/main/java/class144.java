import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public class class144 extends class147 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 642083359
	)
	int field1677;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1671740993
	)
	int field1680;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1281571515
	)
	int field1678;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -576189647
	)
	int field1679;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	final class150 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfu;)V"
	)
	class144(class150 var1) {
		this.this$0 = var1;
		this.field1677 = -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "1738227110"
	)
	void vmethod3486(Buffer var1) {
		this.field1677 = var1.readUnsignedShort();
		this.field1680 = var1.readInt();
		this.field1678 = var1.readUnsignedByte();
		this.field1679 = var1.readUnsignedByte();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgc;B)V",
		garbageValue = "100"
	)
	void vmethod3490(ClanSettings var1) {
		var1.method3333(this.field1677, this.field1680, this.field1678, this.field1679);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ldw;IIB)V",
		garbageValue = "-79"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		if (ItemContainer.isWorldMapEvent(var0.type)) {
			SecureUrlRequester.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var6 = WorldMapElement.WorldMapElement_get(SecureUrlRequester.worldMapEvent.mapElement);
			var4 = AsyncRestClient.getWorldMapScript(var0.type, var6.objectId, var6.category);
		} else {
			int var5 = (Integer)var3[0];
			var4 = TaskHandler.getScript(var5);
		}

		if (var4 != null) {
			SequenceDefinition.runScriptLogic(var0, var4, var1, var2);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lhk;",
		garbageValue = "-242223001"
	)
	public static VarcInt method3208(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0);
			var1 = new VarcInt();
			if (var2 != null) {
				var1.method3855(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-23151887"
	)
	@Export("menuActionByIdx")
	static final void menuActionByIdx(int var0) {
		if (var0 >= 0) {
			int var1 = Client.menuArguments1[var0];
			int var2 = Client.menuArguments2[var0];
			int var3 = Client.menuOpcodes[var0];
			int var4 = Client.menuIdentifiers[var0];
			int var5 = Client.menuWorldViewIds[var0];
			int var6 = Client.menuItemIds[var0];
			String var7 = Client.menuActions[var0];
			String var8 = Client.menuTargets[var0];
			PacketWriter.menuAction(var1, var2, var3, var4, var6, var5, var7, var8, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}
}
