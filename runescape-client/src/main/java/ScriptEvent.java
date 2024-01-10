import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("am")
	@Export("args")
	Object[] args;
	@ObfuscatedName("ap")
	boolean field1056;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1314429303
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1485219497
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1369710663
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1559051435
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1536654943
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("aa")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 677421933
	)
	int field1065;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1254028745
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "-1122840461"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "882056995"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)V",
		garbageValue = "2103666237"
	)
	public void method2355(Widget var1) {
		this.widget = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1897100616"
	)
	static void method2361(String var0, String var1, String var2) {
		Actor.method2489(7);
		class142.setLoginResponseString(var0, var1, var2);
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "45"
	)
	static final void method2366(int var0, int var1) {
		if (Client.hintArrowType == 2) {
			FriendSystem.worldToScreen(Client.hintArrowSubX * 64 + (Client.hintArrowX - HealthBarDefinition.baseX * 64 << 7), Client.hintArrowSubY * 64 + (Client.hintArrowY - WorldMapScaleHandler.baseY * 64 << 7), Client.hintArrowHeight * 4);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				GrandExchangeOfferOwnWorldComparator.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}

		}
	}
}
