import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ui")
public class class523 implements class522 {
	@ObfuscatedName("ab")
	Map field5244;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	final class556 field5245;

	@ObfuscatedSignature(
		descriptor = "(Lvt;)V"
	)
	public class523(class556 var1) {
		this.field5245 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1694445928"
	)
	public int vmethod9333(int var1) {
		if (this.field5244 != null) {
			class557 var2 = (class557)this.field5244.get(var1);
			if (var2 != null) {
				return (Integer)var2.field5445;
			}
		}

		return (Integer)this.field5245.vmethod9922(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/Object;B)V",
		garbageValue = "1"
	)
	public void vmethod9334(int var1, Object var2) {
		if (this.field5244 == null) {
			this.field5244 = new HashMap();
			this.field5244.put(var1, new class557(var1, var2));
		} else {
			class557 var3 = (class557)this.field5244.get(var1);
			if (var3 == null) {
				this.field5244.put(var1, new class557(var1, var2));
			} else {
				var3.field5445 = var2;
			}
		}

	}

	public Iterator iterator() {
		return this.field5244 == null ? Collections.emptyList().iterator() : this.field5244.values().iterator();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-468892939"
	)
	static ArrayList method9342() {
		ArrayList var0 = new ArrayList();
		Iterator var1 = class332.musicSongs.iterator();

		while (var1.hasNext()) {
			MusicSong var2 = (MusicSong)var1.next();
			var0.add(var2);
		}

		return var0;
	}
}
