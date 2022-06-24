import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ds")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("e")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;

	@ObfuscatedName("in")
	@ObfuscatedSignature(descriptor = "[Lqe;")
	@Export("crossSprites")
	static SpritePixels[] crossSprites;

	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lnm;Lnm;B)I", garbageValue = "114")
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)Lfj;", garbageValue = "273043499")
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = ((NPCComposition) (NPCComposition.NpcDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)I", garbageValue = "-107")
	public static int method2620(String var0) {
		return var0.length() + 2;
	}
}