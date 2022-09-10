import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gt")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lgs;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Llv;Llv;IZ)V",
		garbageValue = "0"
	)
	public Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque(); // L: 11
		int var6 = var1.getGroupFileCount(var3); // L: 12
		this.frames = new Animation[var6]; // L: 13
		int[] var7 = var1.getGroupFileIds(var3); // L: 14

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 15
			byte[] var9 = var1.takeFile(var3, var7[var8]); // L: 16
			Skeleton var10 = null; // L: 17
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255; // L: 18

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) { // L: 19 20 25
				if (var11 == var12.id) { // L: 21
					var10 = var12; // L: 22
					break;
				}
			}

			if (var10 == null) { // L: 27
				byte[] var13 = var2.getFile(var11, 0); // L: 30
				var10 = new Skeleton(var11, var13); // L: 31
				var5.addFirst(var10); // L: 32
			}

			this.frames[var7[var8]] = new Animation(var9, var10); // L: 34
		}

	} // L: 36

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2011995874"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform; // L: 39
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "1190393229"
	)
	static int method4473(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) { // L: 809
			var0 -= 1000; // L: 810
			var3 = SpotAnimationDefinition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 811
		} else {
			var3 = var2 ? TextureProvider.scriptDotWidget : MenuAction.scriptActiveWidget; // L: 813
		}

		class403.invalidateWidget(var3); // L: 814
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) { // L: 815
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) { // L: 835
				var3.modelType = 2; // L: 836
				var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 837
				return 1; // L: 838
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) { // L: 840
				var3.modelType = 3; // L: 841
				var3.modelId = class67.localPlayer.appearance.getChatHeadId(); // L: 842
				return 1; // L: 843
			} else {
				return 2; // L: 845
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 2; // L: 816
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 817
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 818
			var3.itemId = var4; // L: 819
			var3.itemQuantity = var5; // L: 820
			ItemComposition var6 = UserComparator3.ItemDefinition_get(var4); // L: 821
			var3.modelAngleX = var6.xan2d; // L: 822
			var3.modelAngleY = var6.yan2d; // L: 823
			var3.modelAngleZ = var6.zan2d; // L: 824
			var3.modelOffsetX = var6.offsetX2d; // L: 825
			var3.modelOffsetY = var6.offsetY2d; // L: 826
			var3.modelZoom = var6.zoom2d; // L: 827
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) { // L: 828
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) { // L: 829
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2; // L: 830
			}

			if (var3.field3446 > 0) { // L: 831
				var3.modelZoom = var3.modelZoom * 32 / var3.field3446;
			} else if (var3.rawWidth > 0) { // L: 832
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1; // L: 833
		}
	}
}
