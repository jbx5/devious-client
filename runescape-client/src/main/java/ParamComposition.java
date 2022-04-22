import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("ParamDefinition_archive")
	public static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("ParamDefinition_cached")
	public static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"Lmd;")

	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"Lqq;")

	static IndexedSprite field1983;
	@ObfuscatedName("i")
	@Export("type")
	char type;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	1031818341)

	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("b")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("n")
	@Export("autoDisable")
	boolean autoDisable;
	static 
	{
		ParamDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	ParamComposition() {
		this.autoDisable = true;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"32")

	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;B)V", garbageValue = 
	"-31")

	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		} 
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;II)V", garbageValue = 
	"-1270383692")

	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.type = class293.method5600(var1.readByte());
		} else if (var2 == 2) {
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false;
		} else if (var2 == 5) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"0")

	@Export("isString")
	public boolean isString() {
		return this.type == 's';
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(II)Z", garbageValue = 
	"-665269599")

	public static boolean method3596(int var0) {
		return ((var0 >> 22) & 1) != 0;
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(descriptor = 
	"(IB)Ljava/lang/String;", garbageValue = 
	"-83")

	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = (var1.substring(0, var2) + ",") + var1.substring(var2);
		}

		if (var1.length() > 9) {
			return (((((((" " + UserComparator9.colorStartTag(65408)) + var1.substring(0, var1.length() - 8)) + "M") + " ") + " (") + var1) + ")") + "</col>";
		} else {
			return var1.length() > 6 ? (((((((" " + UserComparator9.colorStartTag(16777215)) + var1.substring(0, var1.length() - 4)) + "K") + " ") + " (") + var1) + ")") + "</col>" : ((" " + UserComparator9.colorStartTag(16776960)) + var1) + "</col>";
		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(descriptor = 
	"(Lky;IIS)V", garbageValue = 
	"180")

	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if ((Client.clickedWidget == null) && (!Client.isMenuOpen)) {
			if ((var0 != null) && (FriendLoginUpdate.method6686(var0) != null)) {
				Client.clickedWidget = var0;
				Client.clickedWidgetParent = FriendLoginUpdate.method6686(var0);
				Client.widgetClickX = var1;
				Client.widgetClickY = var2;
				class124.widgetDragDuration = 0;
				Client.isDraggingWidget = false;
				int var3 = GameBuild.method5773();
				if (var3 != (-1)) {
					Interpreter.tempMenuAction = new MenuAction();
					Interpreter.tempMenuAction.param0 = Client.menuArguments1[var3];
					Interpreter.tempMenuAction.param1 = Client.menuArguments2[var3];
					Interpreter.tempMenuAction.opcode = Client.menuOpcodes[var3];
					Interpreter.tempMenuAction.identifier = Client.menuIdentifiers[var3];
					Interpreter.tempMenuAction.action = Client.menuActions[var3];
				}

			}
		}
	}
}