import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
public class class408 extends AbstractQueue {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lpp;"
	)
	class406[] field4519;
	@ObfuscatedName("ap")
	Map field4521;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -147827643
	)
	int field4520;
	@ObfuscatedName("aj")
	final Comparator field4522;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -215157783
	)
	int field4523;

	public class408(int var1, Comparator var2) {
		this.field4523 = 0;
		this.field4519 = new class406[var1];
		this.field4521 = new HashMap();
		this.field4522 = var2;
	}

	public class408(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "34"
	)
	void method7563() {
		int var1 = (this.field4519.length << 1) + 1;
		this.field4519 = (class406[])((class406[])Arrays.copyOf(this.field4519, var1));
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "57"
	)
	void method7568(int var1) {
		class406 var2;
		int var3;
		for (var2 = this.field4519[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class406 var4 = this.field4519[var3];
			if (this.field4522 != null) {
				if (this.field4522.compare(var2.field4512, var4.field4512) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field4512).compareTo(var4.field4512) >= 0) {
				break;
			}

			this.field4519[var1] = var4;
			this.field4519[var1].field4513 = var1;
		}

		this.field4519[var1] = var2;
		this.field4519[var1].field4513 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1633022080"
	)
	void method7567(int var1) {
		class406 var2 = this.field4519[var1];

		int var8;
		for (int var3 = this.field4520 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class406 var5 = this.field4519[var4];
			int var6 = (var1 << 1) + 2;
			class406 var7 = this.field4519[var6];
			if (this.field4522 != null) {
				if (var6 < this.field4520 && this.field4522.compare(var5.field4512, var7.field4512) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4520 && ((Comparable)var5.field4512).compareTo(var7.field4512) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4522 != null) {
				if (this.field4522.compare(var2.field4512, this.field4519[var8].field4512) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field4512).compareTo(this.field4519[var8].field4512) <= 0) {
				break;
			}

			this.field4519[var1] = this.field4519[var8];
			this.field4519[var1].field4513 = var1;
		}

		this.field4519[var1] = var2;
		this.field4519[var1].field4513 = var1;
	}

	public boolean remove(Object var1) {
		class406 var2 = (class406)this.field4521.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4523;
			--this.field4520;
			if (this.field4520 == var2.field4513) {
				this.field4519[this.field4520] = null;
				return true;
			} else {
				class406 var3 = this.field4519[this.field4520];
				this.field4519[this.field4520] = null;
				this.field4519[var2.field4513] = var3;
				this.field4519[var2.field4513].field4513 = var2.field4513;
				this.method7567(var2.field4513);
				if (var3 == this.field4519[var2.field4513]) {
					this.method7568(var2.field4513);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4520 == 0 ? null : this.field4519[0].field4512;
	}

	public int size() {
		return this.field4520;
	}

	public boolean contains(Object var1) {
		return this.field4521.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4522 != null) {
			Arrays.sort(var1, this.field4522);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public boolean offer(Object var1) {
		if (this.field4521.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4523;
			int var2 = this.field4520;
			if (var2 >= this.field4519.length) {
				this.method7563();
			}

			++this.field4520;
			if (var2 == 0) {
				this.field4519[0] = new class406(var1, 0);
				this.field4521.put(var1, this.field4519[0]);
			} else {
				this.field4519[var2] = new class406(var1, var2);
				this.field4521.put(var1, this.field4519[var2]);
				this.method7568(var2);
			}

			return true;
		}
	}

	public Object poll() {
		if (this.field4520 == 0) {
			return null;
		} else {
			++this.field4523;
			Object var1 = this.field4519[0].field4512;
			this.field4521.remove(var1);
			--this.field4520;
			if (this.field4520 == 0) {
				this.field4519[this.field4520] = null;
			} else {
				this.field4519[0] = this.field4519[this.field4520];
				this.field4519[0].field4513 = 0;
				this.field4519[this.field4520] = null;
				this.method7567(0);
			}

			return var1;
		}
	}

	public Iterator iterator() {
		return new class407(this);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-93"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;

		try {
			var0 = Huffman.getPreferencesFile("", class1.field3.name, true);
			Buffer var1 = class93.clientPreferences.toBuffer();
			var0.write(var1.array, 0, var1.offset);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	static void method7592(boolean var0) {
		byte var1 = 0;
		if (!GrandExchangeOfferUnitPriceComparator.method7241()) {
			var1 = 12;
		} else if (VertexNormal.client.containsAccessAndRefreshToken() || VertexNormal.client.method1368() || VertexNormal.client.containsSessionAndCharacterId()) {
			var1 = 10;
		}

		Actor.method2489(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			class130.otpMedium = 0;
			class148.otp = "";
		}

		LoginPacket.method5996();
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}
}
