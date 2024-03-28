import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("az")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrw;Lrw;I)I",
		garbageValue = "693520879"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)Lck;",
		garbageValue = "20289"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[++World.World_listCount - 1] : null;
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(Lov;Ljava/lang/String;S)V",
		garbageValue = "15657"
	)
	static void method2944(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field773 += var2.groupCount;
	}
}
