import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("c")
	@Export("args")
	Object[] args;
	@ObfuscatedName("p")
	@Export("isMouseInputEvent")
	boolean isMouseInputEvent;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 528560571
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1754398345
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1478226629
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1661440689
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -804601977
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("x")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1353152335
	)
	int field1041;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 426469011
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76; // L: 19
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "-1717365250"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1; // L: 22
	} // L: 23

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1147230036"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1; // L: 26
	} // L: 27
}
