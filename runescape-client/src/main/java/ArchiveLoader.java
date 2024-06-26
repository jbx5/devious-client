import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 942374317
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -338655735
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Loz;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1670769241"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method7148(var1) || this.archive.method7138(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;Lok;I)V",
		garbageValue = "346869431"
	)
	public static void method2357(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2) {
		AbstractSocket.SequenceDefinition_archive = var0;
		class177.SequenceDefinition_animationsArchive = var1;
		WorldMapLabelSize.SequenceDefinition_skeletonsArchive = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "788851463"
	)
	static void method2359() {
		if ((Client.worldProperties & class542.field5342.rsOrdinal()) != 0) {
			Login.Login_response0 = "";
			Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
			Login.Login_response2 = "Your normal account will not be affected.";
			Login.Login_response3 = "";
			class163.updateLoginIndex(1);
			UserComparator4.focusPasswordWhenUsernameFilled();
		} else if ((Client.worldProperties & class542.field5319.rsOrdinal()) != 0) {
			if ((Client.worldProperties & class542.field5337.rsOrdinal()) != 0) {
				Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
				Login.Login_response2 = "Players can attack each other almost everywhere";
				Login.Login_response3 = "and the Protect Item prayer won't work.";
			} else {
				Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
				Login.Login_response2 = "Players can attack each other";
				Login.Login_response3 = "almost everywhere.";
			}

			Login.Login_response0 = "Warning!";
			class163.updateLoginIndex(1);
			UserComparator4.focusPasswordWhenUsernameFilled();
		} else if ((Client.worldProperties & class542.field5337.rsOrdinal()) != 0) {
			Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
			Login.Login_response2 = "The Protect Item prayer will";
			Login.Login_response3 = "not work on this world.";
			Login.Login_response0 = "Warning!";
			class163.updateLoginIndex(1);
			UserComparator4.focusPasswordWhenUsernameFilled();
		} else {
			class155.Login_promptCredentials(false);
		}

	}

	@ObfuscatedName("mg")
	@ObfuscatedSignature(
		descriptor = "([Lnx;IIIZI)V",
		garbageValue = "-1695472477"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				AbstractWorldMapData.alignWidgetSize(var6, var2, var3, var4);
				SecureRandomCallable.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					class238.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}
}
