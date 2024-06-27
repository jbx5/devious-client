import java.util.ArrayList;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rq")
@Implements("ConcurrentMidiTask")
public class ConcurrentMidiTask extends SongTask {
	@ObfuscatedName("aq")
	ArrayList field4817;

	@ObfuscatedSignature(
		descriptor = "(Lro;Ljava/util/ArrayList;)V"
	)
	public ConcurrentMidiTask(SongTask var1, ArrayList var2) {
		super(var1);
		this.field4817 = var2;
		super.field4814 = "ConcurrentMidiTask";
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-4307"
	)
	public boolean vmethod8276() {
		for (int var1 = 0; var1 < this.field4817.size(); ++var1) {
			SongTask var2 = (SongTask)this.field4817.get(var1);
			if (var2 == null) {
				this.field4817.remove(var1);
				--var1;
			} else if (var2.vmethod8276()) {
				if (var2.method8249()) {
					this.method8253(var2.method8251());
					this.field4817.clear();
					return true;
				}

				if (var2.method8254() != null) {
					this.field4817.add(var2.method8254());
				}

				super.field4816 = var2.field4816;
				this.field4817.remove(var1);
				--var1;
			}
		}

		if (this.field4817.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BILjava/lang/CharSequence;I)I",
		garbageValue = "-1012537953"
	)
	public static int method8274(byte[] var0, int var1, CharSequence var2) {
		int var3 = var2.length();
		int var4 = var1;

		for (int var5 = 0; var5 < var3; ++var5) {
			char var6 = var2.charAt(var5);
			if (var6 <= 127) {
				var0[var4++] = (byte)var6;
			} else if (var6 <= 2047) {
				var0[var4++] = (byte)(192 | var6 >> 6);
				var0[var4++] = (byte)(128 | var6 & '?');
			} else {
				var0[var4++] = (byte)(224 | var6 >> '\f');
				var0[var4++] = (byte)(128 | var6 >> 6 & 63);
				var0[var4++] = (byte)(128 | var6 & '?');
			}
		}

		return var4 - var1;
	}
}
