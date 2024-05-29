import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("an")
	@Export("userHomeDirectory")
	static String userHomeDirectory;
	@ObfuscatedName("ak")
	@Export("args")
	Object[] args;
	@ObfuscatedName("al")
	boolean field1092;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -361293249
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1225945623
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 192584687
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1104718817
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1455858769
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("ao")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -262495581
	)
	int field1100;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 759425415
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "1439023135"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-672994861"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnb;B)V",
		garbageValue = "8"
	)
	public void method2327(Widget var1) {
		this.widget = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Liz;",
		garbageValue = "1731505000"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-116"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
