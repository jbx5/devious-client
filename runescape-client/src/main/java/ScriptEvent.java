import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("ap")
	@Export("args")
	Object[] args;
	@ObfuscatedName("aw")
	boolean field1098;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -186229437
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 933764735
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -999128729
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1680545291
	)
	int field1103;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -170949425
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1050168463
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("au")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 181598379
	)
	int field1108;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -983047605
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "1334767346"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "156"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)V",
		garbageValue = "336945340"
	)
	public void method2565(Widget var1) {
		this.widget = var1;
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "864244170"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class389.logOut();
		switch(var0) {
		case 1:
			class6.updateLoginIndex(24);
			class132.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			ReflectionCheck.method698();
		}

	}
}
