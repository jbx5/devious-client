import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("au")
	@Export("args")
	Object[] args;
	@ObfuscatedName("ae")
	boolean field1095;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -653543251
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1416075959
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1591300189
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1613043781
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1374822823
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("af")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 258359261
	)
	int field1093;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 258651033
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "-1709292397"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "693110805"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lmi;B)V",
		garbageValue = "-48"
	)
	public void method2283(Widget var1) {
		this.widget = var1;
	}
}
