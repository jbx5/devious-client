import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
@Implements("UserComparator7")
public class UserComparator7 extends AbstractUserComparator {
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator7(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnr;Lnr;B)I",
		garbageValue = "-114"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2; // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(ILnj;Llb;I)V",
		garbageValue = "-1549871621"
	)
	static void method2750(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction(); // L: 40
		var3.type = 1; // L: 41
		var3.key = (long)var0; // L: 42
		var3.archiveDisk = var1; // L: 43
		var3.archive = var2; // L: 44
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 45
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3); // L: 46
		} // L: 47

		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 49
			if (ArchiveDiskActionHandler.field4018 == 0) { // L: 50
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 51
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 52
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start(); // L: 53
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5); // L: 54
			}

			ArchiveDiskActionHandler.field4018 = 600; // L: 56
		}
	} // L: 59

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-48"
	)
	static final void method2743() {
		Object var10000 = null; // L: 183
		String var0 = "You can't add yourself to your own ignore list";
		class65.addGameMessage(30, "", var0); // L: 185
	} // L: 187
}
