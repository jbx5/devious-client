import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
public class class393 extends AbstractQueue {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lpa;"
	)
	class391[] field4455;
	@ObfuscatedName("ay")
	Map field4456;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1516026649
	)
	int field4457;
	@ObfuscatedName("am")
	final Comparator field4458;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -719774473
	)
	int field4459;

	public class393(int var1, Comparator var2) {
		this.field4459 = 0;
		this.field4455 = new class391[var1];
		this.field4456 = new HashMap();
		this.field4458 = var2;
	}

	public class393(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1737767650"
	)
	void method7272() {
		int var1 = (this.field4455.length << 1) + 1;
		this.field4455 = (class391[])((class391[])Arrays.copyOf(this.field4455, var1));
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "110"
	)
	void method7276(int var1) {
		class391 var2;
		int var3;
		for (var2 = this.field4455[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class391 var4 = this.field4455[var3];
			if (this.field4458 != null) {
				if (this.field4458.compare(var2.field4450, var4.field4450) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field4450).compareTo(var4.field4450) >= 0) {
				break;
			}

			this.field4455[var1] = var4;
			this.field4455[var1].field4448 = var1;
		}

		this.field4455[var1] = var2;
		this.field4455[var1].field4448 = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	void method7277(int var1) {
		class391 var2 = this.field4455[var1];

		int var8;
		for (int var3 = this.field4457 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class391 var5 = this.field4455[var4];
			int var6 = (var1 << 1) + 2;
			class391 var7 = this.field4455[var6];
			if (this.field4458 != null) {
				if (var6 < this.field4457 && this.field4458.compare(var5.field4450, var7.field4450) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4457 && ((Comparable)var5.field4450).compareTo(var7.field4450) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4458 != null) {
				if (this.field4458.compare(var2.field4450, this.field4455[var8].field4450) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field4450).compareTo(this.field4455[var8].field4450) <= 0) {
				break;
			}

			this.field4455[var1] = this.field4455[var8];
			this.field4455[var1].field4448 = var1;
		}

		this.field4455[var1] = var2;
		this.field4455[var1].field4448 = var1;
	}

	public boolean remove(Object var1) {
		class391 var2 = (class391)this.field4456.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4459;
			--this.field4457;
			if (var2.field4448 == this.field4457) {
				this.field4455[this.field4457] = null;
				return true;
			} else {
				class391 var3 = this.field4455[this.field4457];
				this.field4455[this.field4457] = null;
				this.field4455[var2.field4448] = var3;
				this.field4455[var2.field4448].field4448 = var2.field4448;
				this.method7277(var2.field4448);
				if (var3 == this.field4455[var2.field4448]) {
					this.method7276(var2.field4448);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4457 == 0 ? null : this.field4455[0].field4450;
	}

	public int size() {
		return this.field4457;
	}

	public boolean contains(Object var1) {
		return this.field4456.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4458 != null) {
			Arrays.sort(var1, this.field4458);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Iterator iterator() {
		return new class392(this);
	}

	public Object poll() {
		if (this.field4457 == 0) {
			return null;
		} else {
			++this.field4459;
			Object var1 = this.field4455[0].field4450;
			this.field4456.remove(var1);
			--this.field4457;
			if (this.field4457 == 0) {
				this.field4455[this.field4457] = null;
			} else {
				this.field4455[0] = this.field4455[this.field4457];
				this.field4455[0].field4448 = 0;
				this.field4455[this.field4457] = null;
				this.method7277(0);
			}

			return var1;
		}
	}

	public boolean offer(Object var1) {
		if (this.field4456.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4459;
			int var2 = this.field4457;
			if (var2 >= this.field4455.length) {
				this.method7272();
			}

			++this.field4457;
			if (var2 == 0) {
				this.field4455[0] = new class391(var1, 0);
				this.field4456.put(var1, this.field4455[0]);
			} else {
				this.field4455[var2] = new class391(var1, var2);
				this.field4456.put(var1, this.field4455[var2]);
				this.method7276(var2);
			}

			return true;
		}
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-408081757"
	)
	static final void method7302() {
		for (Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) {
			if (var0.plane == class36.Client_plane && Client.cycle <= var0.cycleEnd) {
				if (Client.cycle >= var0.cycleStart) {
					if (var0.targetIndex > 0) {
						NPC var1 = Client.npcs[var0.targetIndex - 1];
						if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) {
							var0.setDestination(var1.x, var1.y, class306.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					if (var0.targetIndex < 0) {
						int var2 = -var0.targetIndex - 1;
						Player var3;
						if (var2 == Client.localPlayerIndex) {
							var3 = class136.localPlayer;
						} else {
							var3 = Client.players[var2];
						}

						if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
							var0.setDestination(var3.x, var3.y, class306.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle);
						}
					}

					var0.advance(Client.graphicsCycle);
					UserComparator5.scene.drawEntity(class36.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false);
				}
			} else {
				var0.remove();
			}
		}

	}
}
