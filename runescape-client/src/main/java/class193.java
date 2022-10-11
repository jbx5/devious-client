import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public enum class193 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	field2248((byte)-1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	field2244((byte)0),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	field2246((byte)1),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	field2247((byte)2);

	@ObfuscatedName("k")
	public byte field2245;

	class193(byte var3) {
		this.field2245 = var3; // L: 14
	} // L: 15

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2245; // L: 19
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfs;",
		garbageValue = "32"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0); // L: 65
		if (var1 != null) { // L: 66
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0); // L: 67
			var1 = new NPCComposition(); // L: 68
			var1.id = var0; // L: 69
			if (var2 != null) { // L: 70
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 71
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0); // L: 72
			return var1; // L: 73
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-45"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 9247
			Widget var0 = JagexCache.getWidgetChild(ClanSettings.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 9248
			if (var0 != null && var0.onTargetLeave != null) { // L: 9249
				ScriptEvent var1 = new ScriptEvent(); // L: 9250
				var1.widget = var0; // L: 9251
				var1.args = var0.onTargetLeave; // L: 9252
				class348.runScriptEvent(var1); // L: 9253
			}

			Client.selectedSpellItemId = -1; // L: 9255
			Client.isSpellSelected = false; // L: 9256
			class403.invalidateWidget(var0); // L: 9257
		}
	} // L: 9258

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "1370548065"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (FloorOverlayDefinition.loadInterface(var0)) { // L: 9764
			BoundaryObject.field2663 = null; // L: 9771
			GraphicsObject.drawInterface(Calendar.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7); // L: 9772
			if (BoundaryObject.field2663 != null) { // L: 9773
				GraphicsObject.drawInterface(BoundaryObject.field2663, -1412584499, var1, var2, var3, var4, MouseHandler.field240, Tile.field2344, var7); // L: 9774
				BoundaryObject.field2663 = null; // L: 9775
			}

		} else {
			if (var7 != -1) { // L: 9765
				Client.field714[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) { // L: 9767
					Client.field714[var8] = true;
				}
			}

		}
	} // L: 9769 9777
}
