import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	static final WorldMapID field3244;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	static final WorldMapID field3243;
	@ObfuscatedName("gj")
	@Export("refreshToken")
	static String refreshToken;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -390604673
	)
	@Export("value")
	final int value;

	static {
		field3244 = new WorldMapID(0);
		field3243 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhh;",
		garbageValue = "38"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2097485553"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		class4.method16();
		Client.menu.menuWorldViewIds[0] = -1;
		Client.menu.menuActions[0] = "Cancel";
		Client.menu.menuTargets[0] = "";
		Client.menu.menuOpcodes[0] = 1006;
		Client.menu.menuShiftClick[0] = false;
		Client.menu.subMenus[0] = null;
		Client.menu.menuOptionsCount = 1;
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)V",
		garbageValue = "-903002751"
	)
	static final void method6299(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 324) {
			if (Client.field784 == -1) {
				Client.field784 = var0.spriteId2;
				Client.field785 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field784;
			} else {
				var0.spriteId2 = Client.field785;
			}

		} else if (var1 == 325) {
			if (Client.field784 == -1) {
				Client.field784 = var0.spriteId2;
				Client.field785 = var0.spriteId;
			}

			if (Client.playerAppearance.gender == 1) {
				var0.spriteId2 = Client.field785;
			} else {
				var0.spriteId2 = Client.field784;
			}

		} else if (var1 == 327) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 0;
		} else if (var1 == 328) {
			var0.modelAngleX = 150;
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047;
			var0.modelType = 5;
			var0.modelId = 1;
		}
	}
}
