import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
public class class113 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class113 field1454;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class113 field1450;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class113 field1444;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class113 field1447;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class113 field1446;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class113 field1443;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class113 field1448;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class113 field1449;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class113 field1442;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class113 field1455;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class113 field1452;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class113 field1453;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class113 field1451;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	@Export("field1390")
	static final class113 field1390;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class113 field1456;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	static final class113 field1457;
	@ObfuscatedName("dw")
	@ObfuscatedSignature(
		descriptor = "[Lvt;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("id")
	@ObfuscatedGetter(
		longValue = -7995185437776682059L
	)
	static long field1459;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -622240461
	)
	int field1458;

	static {
		field1454 = new class113(0);
		field1450 = new class113(1);
		field1444 = new class113(2);
		field1447 = new class113(3);
		field1446 = new class113(4);
		field1443 = new class113(5);
		field1448 = new class113(6);
		field1449 = new class113(7);
		field1442 = new class113(8);
		field1455 = new class113(9);
		field1452 = new class113(10);
		field1453 = new class113(11);
		field1451 = new class113(12);
		field1390 = new class113(13);
		field1456 = new class113(14);
		field1457 = new class113(15);
	}

	class113(int var1) {
		this.field1458 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1849050817"
	)
	public static void method3037() {
		synchronized(MouseHandler.MouseHandler_instance) {
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
			MouseHandler.MouseHandler_lastButtonVolatile = 0;
		}
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "54"
	)
	static void method3038(int var0, int var1, int var2, int var3) {
		Widget var4 = TaskHandler.widgetDefinition.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			class215.runScriptEvent(var5);
		}

		Client.selectedSpellItemId = var3;
		Client.isSpellSelected = true;
		class36.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		class320.selectedSpellFlags = var2;
		SecureRandomCallable.invalidateWidget(var4);
	}
}
