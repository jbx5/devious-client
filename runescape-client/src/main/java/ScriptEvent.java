import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("az")
	@Export("args")
	Object[] args;
	@ObfuscatedName("ah")
	boolean field1078;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1798935257
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1899347697
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 572449949
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -862554869
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1619291901
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("al")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 2000331233
	)
	int field1087;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2067849717
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;B)V",
		garbageValue = "-46"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "43"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "-1958973698"
	)
	public void method2305(Widget var1) {
		this.widget = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1960766410"
	)
	public static void method2306() {
		InvDefinition.InvDefinition_cached.clear();
	}
}
