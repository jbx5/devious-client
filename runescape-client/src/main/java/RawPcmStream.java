import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ai")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("c")
	int field331;

	@ObfuscatedName("v")
	int field332;

	@ObfuscatedName("q")
	int field343;

	@ObfuscatedName("f")
	int field334;

	@ObfuscatedName("j")
	int field335;

	@ObfuscatedName("e")
	int field336;

	@ObfuscatedName("g")
	int field337;

	@ObfuscatedName("y")
	@Export("numLoops")
	int numLoops;

	@ObfuscatedName("i")
	@Export("start")
	int start;

	@ObfuscatedName("s")
	@Export("end")
	int end;

	@ObfuscatedName("t")
	boolean field333;

	@ObfuscatedName("z")
	int field342;

	@ObfuscatedName("r")
	int field344;

	@ObfuscatedName("u")
	int field345;

	@ObfuscatedName("k")
	int field341;

	@ObfuscatedSignature(descriptor = "(Laf;III)V")
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field333 = var1.field261;
		this.field332 = var2;
		this.field343 = var3;
		this.field334 = var4;
		this.field331 = 0;
		this.method776();
	}

	@ObfuscatedSignature(descriptor = "(Laf;II)V")
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field333 = var1.field261;
		this.field332 = var2;
		this.field343 = var3;
		this.field334 = 8192;
		this.field331 = 0;
		this.method776();
	}

	@ObfuscatedName("j")
	void method776() {
		this.field335 = this.field343;
		this.field336 = method841(this.field343, this.field334);
		this.field337 = method771(this.field343, this.field334);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "()Laz;")
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "()Laz;")
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("w")
	protected int vmethod5437() {
		return this.field343 == 0 && this.field342 == 0 ? 0 : 1;
	}

	@ObfuscatedName("y")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field343 == 0 && this.field342 == 0) {
			this.skip(var3);
		} else {
			RawSound var4 = ((RawSound) (super.sound));
			int var5 = this.start << 8;
			int var6 = this.end << 8;
			int var7 = var4.samples.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.numLoops = 0;
			}
			int var9 = var2;
			var3 += var2;
			if (this.field331 < 0) {
				if (this.field332 <= 0) {
					this.method785();
					this.remove();
					return;
				}
				this.field331 = 0;
			}
			if (this.field331 >= var7) {
				if (this.field332 >= 0) {
					this.method785();
					this.remove();
					return;
				}
				this.field331 = var7 - 1;
			}
			if (this.numLoops < 0) {
				if (this.field333) {
					if (this.field332 < 0) {
						var9 = this.method799(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field331 >= var5) {
							return;
						}
						this.field331 = var5 + var5 - 1 - this.field331;
						this.field332 = -this.field332;
					}
					while (true) {
						var9 = this.method888(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field331 < var6) {
							return;
						}
						this.field331 = var6 + var6 - 1 - this.field331;
						this.field332 = -this.field332;
						var9 = this.method799(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field331 >= var5) {
							return;
						}
						this.field331 = var5 + var5 - 1 - this.field331;
						this.field332 = -this.field332;
					} 
				} else if (this.field332 < 0) {
					while (true) {
						var9 = this.method799(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field331 >= var5) {
							return;
						}
						this.field331 = var6 - 1 - (var6 - 1 - this.field331) % var8;
					} 
				} else {
					while (true) {
						var9 = this.method888(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field331 < var6) {
							return;
						}
						this.field331 = var5 + (this.field331 - var5) % var8;
					} 
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field333) {
						label127 : {
							if (this.field332 < 0) {
								var9 = this.method799(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field331 >= var5) {
									return;
								}
								this.field331 = var5 + var5 - 1 - this.field331;
								this.field332 = -this.field332;
								if (--this.numLoops == 0) {
									break label127;
								}
							}
							do {
								var9 = this.method888(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field331 < var6) {
									return;
								}
								this.field331 = var6 + var6 - 1 - this.field331;
								this.field332 = -this.field332;
								if (--this.numLoops == 0) {
									break;
								}
								var9 = this.method799(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field331 >= var5) {
									return;
								}
								this.field331 = var5 + var5 - 1 - this.field331;
								this.field332 = -this.field332;
							} while (--this.numLoops != 0 );
						}
					} else {
						int var10;
						if (this.field332 < 0) {
							while (true) {
								var9 = this.method799(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field331 >= var5) {
									return;
								}
								var10 = (var6 - 1 - this.field331) / var8;
								if (var10 >= this.numLoops) {
									this.field331 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}
								this.field331 += var8 * var10;
								this.numLoops -= var10;
							} 
						} else {
							while (true) {
								var9 = this.method888(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field331 < var6) {
									return;
								}
								var10 = (this.field331 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field331 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}
								this.field331 -= var8 * var10;
								this.numLoops -= var10;
							} 
						}
					}
				}
				if (this.field332 < 0) {
					this.method799(var1, var9, 0, var3, 0);
					if (this.field331 < 0) {
						this.field331 = -1;
						this.method785();
						this.remove();
					}
				} else {
					this.method888(var1, var9, var7, var3, 0);
					if (this.field331 >= var7) {
						this.field331 = var7;
						this.method785();
						this.remove();
					}
				}
			}
		}
	}

	@ObfuscatedName("i")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("s")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field342 > 0) {
			if (var1 >= this.field342) {
				if (this.field343 == Integer.MIN_VALUE) {
					this.field343 = 0;
					this.field337 = 0;
					this.field336 = 0;
					this.field335 = 0;
					this.remove();
					var1 = this.field342;
				}
				this.field342 = 0;
				this.method776();
			} else {
				this.field335 += this.field344 * var1;
				this.field336 += this.field345 * var1;
				this.field337 += this.field341 * var1;
				this.field342 -= var1;
			}
		}
		RawSound var2 = ((RawSound) (super.sound));
		int var3 = this.start << 8;
		int var4 = this.end << 8;
		int var5 = var2.samples.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.numLoops = 0;
		}
		if (this.field331 < 0) {
			if (this.field332 <= 0) {
				this.method785();
				this.remove();
				return;
			}
			this.field331 = 0;
		}
		if (this.field331 >= var5) {
			if (this.field332 >= 0) {
				this.method785();
				this.remove();
				return;
			}
			this.field331 = var5 - 1;
		}
		this.field331 += this.field332 * var1;
		if (this.numLoops < 0) {
			if (!this.field333) {
				if (this.field332 < 0) {
					if (this.field331 >= var3) {
						return;
					}
					this.field331 = var4 - 1 - (var4 - 1 - this.field331) % var6;
				} else {
					if (this.field331 < var4) {
						return;
					}
					this.field331 = var3 + (this.field331 - var3) % var6;
				}
			} else {
				if (this.field332 < 0) {
					if (this.field331 >= var3) {
						return;
					}
					this.field331 = var3 + var3 - 1 - this.field331;
					this.field332 = -this.field332;
				}
				while (this.field331 >= var4) {
					this.field331 = var4 + var4 - 1 - this.field331;
					this.field332 = -this.field332;
					if (this.field331 >= var3) {
						return;
					}
					this.field331 = var3 + var3 - 1 - this.field331;
					this.field332 = -this.field332;
				} 
			}
		} else {
			if (this.numLoops > 0) {
				if (this.field333) {
					label129 : {
						if (this.field332 < 0) {
							if (this.field331 >= var3) {
								return;
							}
							this.field331 = var3 + var3 - 1 - this.field331;
							this.field332 = -this.field332;
							if (--this.numLoops == 0) {
								break label129;
							}
						}
						do {
							if (this.field331 < var4) {
								return;
							}
							this.field331 = var4 + var4 - 1 - this.field331;
							this.field332 = -this.field332;
							if (--this.numLoops == 0) {
								break;
							}
							if (this.field331 >= var3) {
								return;
							}
							this.field331 = var3 + var3 - 1 - this.field331;
							this.field332 = -this.field332;
						} while (--this.numLoops != 0 );
					}
				} else {
					label161 : {
						int var7;
						if (this.field332 < 0) {
							if (this.field331 >= var3) {
								return;
							}
							var7 = (var4 - 1 - this.field331) / var6;
							if (var7 >= this.numLoops) {
								this.field331 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}
							this.field331 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field331 < var4) {
								return;
							}
							var7 = (this.field331 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field331 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}
							this.field331 -= var6 * var7;
							this.numLoops -= var7;
						}
						return;
					}
				}
			}
			if (this.field332 < 0) {
				if (this.field331 < 0) {
					this.field331 = -1;
					this.method785();
					this.remove();
				}
			} else if (this.field331 >= var5) {
				this.field331 = var5;
				this.method785();
				this.remove();
			}
		}
	}

	@ObfuscatedName("t")
	public synchronized void method790(int var1) {
		this.method791(var1 << 6, this.method782());
	}

	@ObfuscatedName("z")
	synchronized void method779(int var1) {
		this.method791(var1, this.method782());
	}

	@ObfuscatedName("r")
	synchronized void method791(int var1, int var2) {
		this.field343 = var1;
		this.field334 = var2;
		this.field342 = 0;
		this.method776();
	}

	@ObfuscatedName("u")
	public synchronized int method918() {
		return this.field343 == Integer.MIN_VALUE ? 0 : this.field343;
	}

	@ObfuscatedName("k")
	public synchronized int method782() {
		return this.field334 < 0 ? -1 : this.field334;
	}

	@ObfuscatedName("h")
	public synchronized void method786(int var1) {
		int var2 = ((RawSound) (super.sound)).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}
		if (var1 > var2) {
			var1 = var2;
		}
		this.field331 = var1;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(Z)V", garbageValue = "1")
	public synchronized void method784() {
		this.field332 = (this.field332 ^ this.field332 >> 31) + (this.field332 >>> 31);
		this.field332 = -this.field332;
	}

	@ObfuscatedName("l")
	void method785() {
		if (this.field342 != 0) {
			if (this.field343 == Integer.MIN_VALUE) {
				this.field343 = 0;
			}
			this.field342 = 0;
			this.method776();
		}
	}

	@ObfuscatedName("a")
	public synchronized void method890(int var1, int var2) {
		this.method787(var1, var2, this.method782());
	}

	@ObfuscatedName("p")
	public synchronized void method787(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method791(var2, var3);
		} else {
			int var4 = method841(var2, var3);
			int var5 = method771(var2, var3);
			if (var4 == this.field336 && var5 == this.field337) {
				this.field342 = 0;
			} else {
				int var6 = var2 - this.field335;
				if (this.field335 - var2 > var6) {
					var6 = this.field335 - var2;
				}
				if (var4 - this.field336 > var6) {
					var6 = var4 - this.field336;
				}
				if (this.field336 - var4 > var6) {
					var6 = this.field336 - var4;
				}
				if (var5 - this.field337 > var6) {
					var6 = var5 - this.field337;
				}
				if (this.field337 - var5 > var6) {
					var6 = this.field337 - var5;
				}
				if (var1 > var6) {
					var1 = var6;
				}
				this.field342 = var1;
				this.field343 = var2;
				this.field334 = var3;
				this.field344 = (var2 - this.field335) / var1;
				this.field345 = (var4 - this.field336) / var1;
				this.field341 = (var5 - this.field337) / var1;
			}
		}
	}

	@ObfuscatedName("b")
	public synchronized void method802(int var1) {
		if (var1 == 0) {
			this.method779(0);
			this.remove();
		} else if (this.field336 == 0 && this.field337 == 0) {
			this.field342 = 0;
			this.field343 = 0;
			this.field335 = 0;
			this.remove();
		} else {
			int var2 = -this.field335;
			if (this.field335 > var2) {
				var2 = this.field335;
			}
			if (-this.field336 > var2) {
				var2 = -this.field336;
			}
			if (this.field336 > var2) {
				var2 = this.field336;
			}
			if (-this.field337 > var2) {
				var2 = -this.field337;
			}
			if (this.field337 > var2) {
				var2 = this.field337;
			}
			if (var1 > var2) {
				var1 = var2;
			}
			this.field342 = var1;
			this.field343 = Integer.MIN_VALUE;
			this.field344 = -this.field335 / var1;
			this.field345 = -this.field336 / var1;
			this.field341 = -this.field337 / var1;
		}
	}

	@ObfuscatedName("n")
	public synchronized void method789(int var1) {
		if (this.field332 < 0) {
			this.field332 = -var1;
		} else {
			this.field332 = var1;
		}
	}

	@ObfuscatedName("ae")
	public synchronized int method819() {
		return this.field332 < 0 ? -this.field332 : this.field332;
	}

	@ObfuscatedName("aj")
	public boolean method860() {
		return this.field331 < 0 || this.field331 >= ((RawSound) (super.sound)).samples.length << 8;
	}

	@ObfuscatedName("ax")
	public boolean method792() {
		return this.field342 != 0;
	}

	@ObfuscatedName("ar")
	int method888(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field342 > 0) {
				int var6 = var2 + this.field342;
				if (var6 > var4) {
					var6 = var4;
				}
				this.field342 += var2;
				if (this.field332 == 256 && (this.field331 & 255) == 0) {
					if (BuddyRankComparator.PcmPlayer_stereo) {
						var2 = method810(0, ((RawSound) (super.sound)).samples, var1, this.field331, var2, this.field336, this.field337, this.field345, this.field341, 0, var6, var3, this);
					} else {
						var2 = method839(((RawSound) (super.sound)).samples, var1, this.field331, var2, this.field335, this.field344, 0, var6, var3, this);
					}
				} else if (BuddyRankComparator.PcmPlayer_stereo) {
					var2 = method814(0, 0, ((RawSound) (super.sound)).samples, var1, this.field331, var2, this.field336, this.field337, this.field345, this.field341, 0, var6, var3, this, this.field332, var5);
				} else {
					var2 = method813(0, 0, ((RawSound) (super.sound)).samples, var1, this.field331, var2, this.field335, this.field344, 0, var6, var3, this, this.field332, var5);
				}
				this.field342 -= var2;
				if (this.field342 != 0) {
					return var2;
				}
				if (!this.method798()) {
					continue;
				}
				return var4;
			}
			if (this.field332 == 256 && (this.field331 & 255) == 0) {
				if (BuddyRankComparator.PcmPlayer_stereo) {
					return method824(0, ((RawSound) (super.sound)).samples, var1, this.field331, var2, this.field336, this.field337, 0, var4, var3, this);
				}
				return method801(((RawSound) (super.sound)).samples, var1, this.field331, var2, this.field335, 0, var4, var3, this);
			}
			if (BuddyRankComparator.PcmPlayer_stereo) {
				return method806(0, 0, ((RawSound) (super.sound)).samples, var1, this.field331, var2, this.field336, this.field337, 0, var4, var3, this, this.field332, var5);
			}
			return method805(0, 0, ((RawSound) (super.sound)).samples, var1, this.field331, var2, this.field335, 0, var4, var3, this, this.field332, var5);
		} 
	}

	@ObfuscatedName("at")
	int vmethod948() {
		int var1 = this.field335 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field331 / (((RawSound) (super.sound)).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound) (super.sound)).samples.length;
		}
		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("ag")
	int method799(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field342 > 0) {
				int var6 = var2 + this.field342;
				if (var6 > var4) {
					var6 = var4;
				}
				this.field342 += var2;
				if (this.field332 == -256 && (this.field331 & 255) == 0) {
					if (BuddyRankComparator.PcmPlayer_stereo) {
						var2 = method831(0, ((RawSound) (super.sound)).samples, var1, this.field331, var2, this.field336, this.field337, this.field345, this.field341, 0, var6, var3, this);
					} else {
						var2 = method811(((RawSound) (super.sound)).samples, var1, this.field331, var2, this.field335, this.field344, 0, var6, var3, this);
					}
				} else if (BuddyRankComparator.PcmPlayer_stereo) {
					var2 = method816(0, 0, ((RawSound) (super.sound)).samples, var1, this.field331, var2, this.field336, this.field337, this.field345, this.field341, 0, var6, var3, this, this.field332, var5);
				} else {
					var2 = method820(0, 0, ((RawSound) (super.sound)).samples, var1, this.field331, var2, this.field335, this.field344, 0, var6, var3, this, this.field332, var5);
				}
				this.field342 -= var2;
				if (this.field342 != 0) {
					return var2;
				}
				if (!this.method798()) {
					continue;
				}
				return var4;
			}
			if (this.field332 == -256 && (this.field331 & 255) == 0) {
				if (BuddyRankComparator.PcmPlayer_stereo) {
					return method905(0, ((RawSound) (super.sound)).samples, var1, this.field331, var2, this.field336, this.field337, 0, var4, var3, this);
				}
				return method921(((RawSound) (super.sound)).samples, var1, this.field331, var2, this.field335, 0, var4, var3, this);
			}
			if (BuddyRankComparator.PcmPlayer_stereo) {
				return method808(0, 0, ((RawSound) (super.sound)).samples, var1, this.field331, var2, this.field336, this.field337, 0, var4, var3, this, this.field332, var5);
			}
			return method807(0, 0, ((RawSound) (super.sound)).samples, var1, this.field331, var2, this.field335, 0, var4, var3, this, this.field332, var5);
		} 
	}

	@ObfuscatedName("aq")
	boolean method798() {
		int var1 = this.field343;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method841(var1, this.field334);
			var3 = method771(var1, this.field334);
		}
		if (var1 == this.field335 && var2 == this.field336 && var3 == this.field337) {
			if (this.field343 == Integer.MIN_VALUE) {
				this.field343 = 0;
				this.field337 = 0;
				this.field336 = 0;
				this.field335 = 0;
				this.remove();
				return true;
			} else {
				this.method776();
				return false;
			}
		} else {
			if (this.field335 < var1) {
				this.field344 = 1;
				this.field342 = var1 - this.field335;
			} else if (this.field335 > var1) {
				this.field344 = -1;
				this.field342 = this.field335 - var1;
			} else {
				this.field344 = 0;
			}
			if (this.field336 < var2) {
				this.field345 = 1;
				if (this.field342 == 0 || this.field342 > var2 - this.field336) {
					this.field342 = var2 - this.field336;
				}
			} else if (this.field336 > var2) {
				this.field345 = -1;
				if (this.field342 == 0 || this.field342 > this.field336 - var2) {
					this.field342 = this.field336 - var2;
				}
			} else {
				this.field345 = 0;
			}
			if (this.field337 < var3) {
				this.field341 = 1;
				if (this.field342 == 0 || this.field342 > var3 - this.field337) {
					this.field342 = var3 - this.field337;
				}
			} else if (this.field337 > var3) {
				this.field341 = -1;
				if (this.field342 == 0 || this.field342 > this.field337 - var3) {
					this.field342 = this.field337 - var3;
				}
			} else {
				this.field341 = 0;
			}
			return false;
		}
	}

	@ObfuscatedName("c")
	static int method841(int var0, int var1) {
		return var1 < 0 ? var0 : ((int) (((double) (var0)) * Math.sqrt(((double) (16384 - var1)) * 1.220703125E-4) + 0.5));
	}

	@ObfuscatedName("v")
	static int method771(int var0, int var1) {
		return var1 < 0 ? -var0 : ((int) (((double) (var0)) * Math.sqrt(((double) (var1)) * 1.220703125E-4) + 0.5));
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Laf;II)Lai;")
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, ((int) (((long) (var0.sampleRate)) * 256L * ((long) (var1)) / ((long) (PcmPlayer.field287 * 100)))), var2 << 6) : null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Laf;III)Lai;")
	public static RawPcmStream method775(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = "([B[IIIIIIILai;)I")
	static int method801(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}
		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}
		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}
		var8.field331 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = "(I[B[IIIIIIIILai;)I")
	static int method824(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}
		var4 <<= 1;
		var7 <<= 1;
		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}
		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}
		var10.field331 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = "([B[IIIIIIILai;)I")
	static int method921(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}
		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}
		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}
		var8.field331 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = "(I[B[IIIIIIIILai;)I")
	static int method905(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var3 + var4 - (var9 - 1)) > var8) {
			var7 = var8;
		}
		var4 <<= 1;
		var7 <<= 1;
		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}
		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}
		var10.field331 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIILai;II)I")
	static int method805(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
			var7 = var8;
		}
		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		} 
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
			var7 = var8;
		}
		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
		}
		var10.field331 = var4;
		return var5;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIIILai;II)I")
	static int method806(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}
		var5 <<= 1;
		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}
		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}
		var8 <<= 1;
		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}
		var11.field331 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIILai;II)I")
	static int method807(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
			var7 = var8;
		}
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		} 
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) {
			var7 = var8;
		}
		var0 = var12;
		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
		}
		var10.field331 = var4;
		return var5;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIIILai;II)I")
	static int method808(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}
		var5 <<= 1;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var2[var1] - var14) * (var4 & 255) + (var14 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}
		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}
		var8 <<= 1;
		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}
		var11.field331 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(descriptor = "([B[IIIIIIIILai;)I")
	static int method839(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}
		var9.field336 += var9.field345 * (var6 - var3);
		var9.field337 += var9.field341 * (var6 - var3);
		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}
		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}
		var9.field335 = var4 >> 2;
		var9.field331 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(descriptor = "(I[B[IIIIIIIIIILai;)I")
	static int method810(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}
		var12.field335 += var12.field344 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;
		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}
		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}
		var12.field336 = var5 >> 2;
		var12.field337 = var6 >> 2;
		var12.field331 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(descriptor = "([B[IIIIIIIILai;)I")
	static int method811(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}
		var9.field336 += var9.field345 * (var6 - var3);
		var9.field337 += var9.field341 * (var6 - var3);
		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}
		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}
		var9.field335 = var4 >> 2;
		var9.field331 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(descriptor = "(I[B[IIIIIIIIIILai;)I")
	static int method831(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}
		var12.field335 += var12.field344 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;
		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}
		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}
		var12.field336 = var5 >> 2;
		var12.field337 = var6 >> 2;
		var12.field331 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIIILai;II)I")
	static int method813(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field336 -= var11.field345 * var5;
		var11.field337 -= var11.field341 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}
		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		} 
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}
		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}
		var11.field336 += var11.field345 * var5;
		var11.field337 += var11.field341 * var5;
		var11.field335 = var6;
		var11.field331 = var4;
		return var5;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIIIIILai;II)I")
	static int method814(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field335 -= var5 * var13.field344;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}
		var5 <<= 1;
		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}
		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}
		var10 <<= 1;
		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}
		var5 >>= 1;
		var13.field335 += var13.field344 * var5;
		var13.field336 = var6;
		var13.field337 = var7;
		var13.field331 = var4;
		return var5;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIIILai;II)I")
	static int method820(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field336 -= var11.field345 * var5;
		var11.field337 -= var11.field341 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		} 
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}
		var0 = var13;
		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}
		var11.field336 += var11.field345 * var5;
		var11.field337 += var11.field341 * var5;
		var11.field335 = var6;
		var11.field331 = var4;
		return var5;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIIIIILai;II)I")
	static int method816(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field335 -= var5 * var13.field344;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}
		var5 <<= 1;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var2[var1] - var16) * (var4 & 255) + (var16 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}
		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}
		var10 <<= 1;
		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}
		var5 >>= 1;
		var13.field335 += var13.field344 * var5;
		var13.field336 = var6;
		var13.field337 = var7;
		var13.field331 = var4;
		return var5;
	}
}