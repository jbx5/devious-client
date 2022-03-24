import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;




import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
	@ObfuscatedName("o")
	@Export("GrandExchangeEvents_ageComparator")
	public static Comparator GrandExchangeEvents_ageComparator;
	@ObfuscatedName("h")
	@Export("GrandExchangeEvents_priceComparator")
	public static Comparator GrandExchangeEvents_priceComparator;
	@ObfuscatedName("g")
	@Export("GrandExchangeEvents_nameComparator")
	public static Comparator GrandExchangeEvents_nameComparator;
	@ObfuscatedName("l")
	@Export("GrandExchangeEvents_quantityComparator")
	public static Comparator GrandExchangeEvents_quantityComparator;
	@ObfuscatedName("v")
	@Export("events")
	public final List events;
	static 
	{
		GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator();
		new GrandExchangeOfferWorldComparator();
		GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator();
		GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator();
		GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
	}

	@ObfuscatedSignature(descriptor = 
	"(Lpd;Z)V", garbageValue = 
	"1")

	public GrandExchangeEvents(Buffer var1, boolean var2) {
		int var3 = var1.readUnsignedShort();
		boolean var4 = var1.readUnsignedByte() == 1;
		byte var5;
		if (var4) {
			var5 = 1;
		} else {
			var5 = 0;
		}

		int var6 = var1.readUnsignedShort();
		this.events = new ArrayList(var6);

		for (int var7 = 0; var7 < var6; ++var7) {
			this.events.add(new GrandExchangeEvent(var1, var5, var3));
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/util/Comparator;ZI)V", garbageValue = 
	"1259206127")

	@Export("sort")
	public void sort(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.events, var1);
		} else {
			Collections.sort(this.events, Collections.reverseOrder(var1));
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"1624825414")

	static int method5993(int var0, Script var1, boolean var2) {
		Widget var3 = (var2) ? class432.scriptDotWidget : class341.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != (-1)) {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.childIndex;
			return 1;
		} else if (var0 == 1707) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (var3.method5642()) ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return class302.method5773(var3);
		} else {
			return var0 == 1708 ? WorldMapSectionType.method4952(var3) : 2;
		}
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(descriptor = 
	"([Lkn;Lkn;ZI)V", garbageValue = 
	"-1924378319")

	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = (var1.scrollWidth != 0) ? (var1.scrollWidth * 519655973) * 737180077 : (var1.width * 1149774003) * (-646003077);
		int var4 = (var1.scrollHeight != 0) ? (var1.scrollHeight * 590865599) * (-4879553) : (var1.height * (-1323757205)) * 1884328771;
		class65.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			class65.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var1.id)))));
		if (var5 != null) {
			int var6 = var5.group;
			if (MusicPatchNode2.loadInterface(var6)) {
				class65.resizeInterface(EnumComposition.Widget_interfaceComponents[var6], -1, var3, var4, var2);
			}
		}

		if (var1.contentType == 1337) {
		}

	}
}