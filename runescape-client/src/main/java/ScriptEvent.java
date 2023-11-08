import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("at")
	@Export("args")
	Object[] args;
	@ObfuscatedName("ah")
	boolean field1054;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1726623421
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1727687657
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -139104943
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1406520627
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -523581111
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("az")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -245472791
	)
	int field1063;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1161157125
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "-1214962197"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "334360487"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lnn;B)V",
		garbageValue = "102"
	)
	public void method2357(Widget var1) {
		this.widget = var1;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "0"
	)
	static int method2367(int var0, Script var1, boolean var2) {
		return 2;
	}
}
