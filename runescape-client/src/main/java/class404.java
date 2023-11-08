import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
public class class404 extends AbstractQueue {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "[Lpw;"
	)
	class402[] field4481;
	@ObfuscatedName("ah")
	Map field4479;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1698360753
	)
	int field4485;
	@ObfuscatedName("ao")
	final Comparator field4480;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1533083803
	)
	int field4483;

	public class404(int var1, Comparator var2) {
		this.field4483 = 0;
		this.field4481 = new class402[var1];
		this.field4479 = new HashMap();
		this.field4480 = var2;
	}

	public class404(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1191377810"
	)
	void method7483() {
		int var1 = (this.field4481.length << 1) + 1;
		this.field4481 = (class402[])((class402[])Arrays.copyOf(this.field4481, var1));
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1780755712"
	)
	void method7485(int var1) {
		class402 var2;
		int var3;
		for (var2 = this.field4481[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class402 var4 = this.field4481[var3];
			if (this.field4480 != null) {
				if (this.field4480.compare(var2.field4474, var4.field4474) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field4474).compareTo(var4.field4474) >= 0) {
				break;
			}

			this.field4481[var1] = var4;
			this.field4481[var1].field4472 = var1;
		}

		this.field4481[var1] = var2;
		this.field4481[var1].field4472 = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1549491018"
	)
	void method7486(int var1) {
		class402 var2 = this.field4481[var1];

		int var8;
		for (int var3 = this.field4485 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class402 var5 = this.field4481[var4];
			int var6 = (var1 << 1) + 2;
			class402 var7 = this.field4481[var6];
			if (this.field4480 != null) {
				if (var6 < this.field4485 && this.field4480.compare(var5.field4474, var7.field4474) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4485 && ((Comparable)var5.field4474).compareTo(var7.field4474) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4480 != null) {
				if (this.field4480.compare(var2.field4474, this.field4481[var8].field4474) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field4474).compareTo(this.field4481[var8].field4474) <= 0) {
				break;
			}

			this.field4481[var1] = this.field4481[var8];
			this.field4481[var1].field4472 = var1;
		}

		this.field4481[var1] = var2;
		this.field4481[var1].field4472 = var1;
	}

	public boolean remove(Object var1) {
		class402 var2 = (class402)this.field4479.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4483;
			--this.field4485;
			if (this.field4485 == var2.field4472) {
				this.field4481[this.field4485] = null;
				return true;
			} else {
				class402 var3 = this.field4481[this.field4485];
				this.field4481[this.field4485] = null;
				this.field4481[var2.field4472] = var3;
				this.field4481[var2.field4472].field4472 = var2.field4472;
				this.method7486(var2.field4472);
				if (var3 == this.field4481[var2.field4472]) {
					this.method7485(var2.field4472);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4485 == 0 ? null : this.field4481[0].field4474;
	}

	public boolean contains(Object var1) {
		return this.field4479.containsKey(var1);
	}

	public int size() {
		return this.field4485;
	}

	public Object poll() {
		if (this.field4485 == 0) {
			return null;
		} else {
			++this.field4483;
			Object var1 = this.field4481[0].field4474;
			this.field4479.remove(var1);
			--this.field4485;
			if (this.field4485 == 0) {
				this.field4481[this.field4485] = null;
			} else {
				this.field4481[0] = this.field4481[this.field4485];
				this.field4481[0].field4472 = 0;
				this.field4481[this.field4485] = null;
				this.method7486(0);
			}

			return var1;
		}
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4480 != null) {
			Arrays.sort(var1, this.field4480);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Iterator iterator() {
		return new class403(this);
	}

	public boolean offer(Object var1) {
		if (this.field4479.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4483;
			int var2 = this.field4485;
			if (var2 >= this.field4481.length) {
				this.method7483();
			}

			++this.field4485;
			if (var2 == 0) {
				this.field4481[0] = new class402(var1, 0);
				this.field4479.put(var1, this.field4481[0]);
			} else {
				this.field4481[var2] = new class402(var1, var2);
				this.field4479.put(var1, this.field4481[var2]);
				this.method7485(var2);
			}

			return true;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FB)F",
		garbageValue = "0"
	)
	static float method7512(class131 var0, float var1) {
		if (var0 != null && var0.method3106() != 0) {
			if (var1 < (float)var0.field1530[0].field1477) {
				return var0.field1535 == class129.field1513 ? var0.field1530[0].field1478 : Decimator.method1152(var0, var1, true);
			} else if (var1 > (float)var0.field1530[var0.method3106() - 1].field1477) {
				return var0.field1529 == class129.field1513 ? var0.field1530[var0.method3106() - 1].field1478 : Decimator.method1152(var0, var1, false);
			} else if (var0.field1527) {
				return var0.field1530[0].field1478;
			} else {
				class126 var2 = var0.method3105(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					float var5;
					float var6;
					float var7;
					if ((double)var2.field1481 == 0.0D && (double)var2.field1482 == 0.0D) {
						var3 = true;
					} else if (var2.field1481 == Float.MAX_VALUE && Float.MAX_VALUE == var2.field1482) {
						var4 = true;
					} else if (var2.field1479 != null) {
						if (var0.field1542) {
							var5 = (float)var2.field1477;
							float var9 = var2.field1478;
							var6 = var5 + var2.field1481 * 0.33333334F;
							float var10 = 0.33333334F * var2.field1482 + var9;
							float var8 = (float)var2.field1479.field1477;
							float var12 = var2.field1479.field1478;
							var7 = var8 - var2.field1479.field1480 * 0.33333334F;
							float var11 = var12 - 0.33333334F * var2.field1479.field1483;
							if (var0.field1532) {
								Language.method7200(var0, var5, var6, var7, var8, var9, var10, var11, var12);
							} else if (var0 != null) {
								var0.field1538 = var5;
								float var13 = var8 - var5;
								float var14 = var12 - var9;
								float var15 = var6 - var5;
								float var16 = 0.0F;
								float var17 = 0.0F;
								if ((double)var15 != 0.0D) {
									var16 = (var10 - var9) / var15;
								}

								var15 = var8 - var7;
								if (0.0D != (double)var15) {
									var17 = (var12 - var11) / var15;
								}

								float var18 = 1.0F / (var13 * var13);
								float var19 = var16 * var13;
								float var20 = var13 * var17;
								var0.field1534 = (var20 + var19 - var14 - var14) * var18 / var13;
								var0.field1548 = var18 * (var14 + var14 + var14 - var19 - var19 - var20);
								var0.field1526 = var16;
								var0.field1537 = var9;
							}

							var0.field1542 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1478;
					} else if (var4) {
						return (float)var2.field1477 != var1 && var2.field1479 != null ? var2.field1479.field1478 : var2.field1478;
					} else if (var0.field1532) {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							if (var0.field1538 == var1) {
								var6 = 0.0F;
							} else if (var0.field1533 == var1) {
								var6 = 1.0F;
							} else {
								var6 = (var1 - var0.field1538) / (var0.field1533 - var0.field1538);
							}

							if (var0.field1531) {
								var7 = var6;
							} else {
								class127.field1487[3] = var0.field1537;
								class127.field1487[2] = var0.field1526;
								class127.field1487[1] = var0.field1548;
								class127.field1487[0] = var0.field1534 - var6;
								class127.field1489[0] = 0.0F;
								class127.field1489[1] = 0.0F;
								class127.field1489[2] = 0.0F;
								class127.field1489[3] = 0.0F;
								class127.field1489[4] = 0.0F;
								int var21 = FloorUnderlayDefinition.method3791(class127.field1487, 3, 0.0F, true, 1.0F, true, class127.field1489);
								if (var21 == 1) {
									var7 = class127.field1489[0];
								} else {
									var7 = 0.0F;
								}
							}

							var5 = var7 * (var0.field1539 + (var0.field1540 + var0.field1528 * var7) * var7) + var0.field1546;
						}

						return var5;
					} else {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							var6 = var1 - var0.field1538;
							var5 = var0.field1537 + var6 * (var6 * (var0.field1548 + var6 * var0.field1534) + var0.field1526);
						}

						return var5;
					}
				}
			}
		} else {
			return 0.0F;
		}
	}
}
