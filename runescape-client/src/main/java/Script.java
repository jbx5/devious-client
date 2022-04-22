import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("sv")
	@ObfuscatedGetter(intValue = 
	1540125023)

	static int field955;
	@ObfuscatedName("ud")
	@ObfuscatedGetter(intValue = 
	1431517737)

	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("c")
	String field954;
	@ObfuscatedName("i")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("f")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("b")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	-61904285)

	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	-166989853)

	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	2085074269)

	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	832856221)

	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"[Lpt;")

	@Export("switches")
	IterableNodeHashTable[] switches;
	static 
	{
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(II)[Lpt;", garbageValue = 
	"1023486381")

	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(II)Ljava/lang/String;", garbageValue = 
	"-881844017")

	static String method1990(int var0) {
		return ("<img=" + var0) + ">";
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IIII)I", garbageValue = 
	"108796867")

	public static int method1996(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(II)Lfl;", garbageValue = 
	"2129001923")

	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = ((InvDefinition) (InvDefinition.InvDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(descriptor = 
	"(Lcc;ZS)V", garbageValue = 
	"7462")

	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = ((int) (var0.key));
		var0.remove();
		if ((var1 && (var2 != (-1))) && WorldMapSectionType.Widget_loadedInterfaces[var2]) {
			Widget.Widget_archive.clearFilesGroup(var2);
			if (Widget.Widget_interfaceComponents[var2] != null) {
				boolean var4 = true;

				for (int var5 = 0; var5 < Widget.Widget_interfaceComponents[var2].length; ++var5) {
					if (Widget.Widget_interfaceComponents[var2][var5] != null) {
						if (Widget.Widget_interfaceComponents[var2][var5].type != 2) {
							Widget.Widget_interfaceComponents[var2][var5] = null;
						} else {
							var4 = false;
						}
					}
				}

				if (var4) {
					Widget.Widget_interfaceComponents[var2] = null;
				}

				WorldMapSectionType.Widget_loadedInterfaces[var2] = false;
			}
		}

		class29.method403(var2);
		Widget var6 = class127.getWidget(var3);
		if (var6 != null) {
			class346.invalidateWidget(var6);
		}

		if (Client.rootInterface != (-1)) {
			MouseRecorder.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}