import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("ab")
	@Export("args")
	Object[] args;
	@ObfuscatedName("ay")
	boolean field1063;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 545550301
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1691233405
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1844900263
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1229255521
	)
	int field1068;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -162629715
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1743540071
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("aq")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1820002501
	)
	int field1066;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1664867553
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "906075064"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnq;I)V",
		garbageValue = "-734629353"
	)
	public void method2421(Widget var1) {
		this.widget = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lmf;",
		garbageValue = "-515175020"
	)
	public static PacketBufferNode method2424() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Ldp;",
		garbageValue = "-108749554"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = RestClientThreadFactory.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = Script.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2146639812"
	)
	static final boolean method2422(int var0) {
		return var0 == 1002 || var0 == 1003 || var0 == 1004;
	}
}
