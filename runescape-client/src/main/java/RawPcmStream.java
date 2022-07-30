import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("av")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("o")
	int field343;

	@ObfuscatedName("q")
	int field338;

	@ObfuscatedName("f")
	int field339;

	@ObfuscatedName("u")
	int field337;

	@ObfuscatedName("c")
	int field341;

	@ObfuscatedName("z")
	int field342;

	@ObfuscatedName("j")
	int field347;

	@ObfuscatedName("h")
	@Export("numLoops")
	int numLoops;

	@ObfuscatedName("a")
	@Export("start")
	int start;

	@ObfuscatedName("d")
	@Export("end")
	int end;

	@ObfuscatedName("n")
	boolean field349;

	@ObfuscatedName("x")
	int field348;

	@ObfuscatedName("g")
	int field350;

	@ObfuscatedName("p")
	int field340;

	@ObfuscatedName("b")
	int field351;

	@ObfuscatedSignature(descriptor = "(Lap;III)V")
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field349 = var1.field274;
		this.field338 = var2;
		this.field339 = var3;
		this.field337 = var4;
		this.field343 = 0;
		this.method934();
	}

	@ObfuscatedSignature(descriptor = "(Lap;II)V")
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field349 = var1.field274;
		this.field338 = var2;
		this.field339 = var3;
		this.field337 = 8192;
		this.field343 = 0;
		this.method934();
	}

	@ObfuscatedName("c")
	void method934() {
		this.field341 = this.field339;
		this.field342 = method880(this.field339, this.field337);
		this.field347 = method916(this.field339, this.field337);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "()Lae;")
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "()Lae;")
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("j")
	protected int vmethod5453() {
		return this.field339 == 0 && this.field348 == 0 ? 0 : 1;
	}

	@ObfuscatedName("h")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field339 == 0 && this.field348 == 0) {
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
			if (this.field343 < 0) {
				if (this.field338 <= 0) {
					this.method805();
					this.remove();
					return;
				}
				this.field343 = 0;
			}
			if (this.field343 >= var7) {
				if (this.field338 >= 0) {
					this.method805();
					this.remove();
					return;
				}
				this.field343 = var7 - 1;
			}
			if (this.numLoops < 0) {
				if (this.field349) {
					if (this.field338 < 0) {
						var9 = this.method819(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field343 >= var5) {
							return;
						}
						this.field343 = var5 + var5 - 1 - this.field343;
						this.field338 = -this.field338;
					}
					while (true) {
						var9 = this.method818(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field343 < var6) {
							return;
						}
						this.field343 = var6 + var6 - 1 - this.field343;
						this.field338 = -this.field338;
						var9 = this.method819(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field343 >= var5) {
							return;
						}
						this.field343 = var5 + var5 - 1 - this.field343;
						this.field338 = -this.field338;
					} 
				} else if (this.field338 < 0) {
					while (true) {
						var9 = this.method819(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field343 >= var5) {
							return;
						}
						this.field343 = var6 - 1 - (var6 - 1 - this.field343) % var8;
					} 
				} else {
					while (true) {
						var9 = this.method818(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field343 < var6) {
							return;
						}
						this.field343 = var5 + (this.field343 - var5) % var8;
					} 
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field349) {
						label127 : {
							if (this.field338 < 0) {
								var9 = this.method819(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field343 >= var5) {
									return;
								}
								this.field343 = var5 + var5 - 1 - this.field343;
								this.field338 = -this.field338;
								if (--this.numLoops == 0) {
									break label127;
								}
							}
							do {
								var9 = this.method818(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field343 < var6) {
									return;
								}
								this.field343 = var6 + var6 - 1 - this.field343;
								this.field338 = -this.field338;
								if (--this.numLoops == 0) {
									break;
								}
								var9 = this.method819(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field343 >= var5) {
									return;
								}
								this.field343 = var5 + var5 - 1 - this.field343;
								this.field338 = -this.field338;
							} while (--this.numLoops != 0 );
						}
					} else {
						int var10;
						if (this.field338 < 0) {
							while (true) {
								var9 = this.method819(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field343 >= var5) {
									return;
								}
								var10 = (var6 - 1 - this.field343) / var8;
								if (var10 >= this.numLoops) {
									this.field343 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}
								this.field343 += var8 * var10;
								this.numLoops -= var10;
							} 
						} else {
							while (true) {
								var9 = this.method818(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field343 < var6) {
									return;
								}
								var10 = (this.field343 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field343 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}
								this.field343 -= var8 * var10;
								this.numLoops -= var10;
							} 
						}
					}
				}
				if (this.field338 < 0) {
					this.method819(var1, var9, 0, var3, 0);
					if (this.field343 < 0) {
						this.field343 = -1;
						this.method805();
						this.remove();
					}
				} else {
					this.method818(var1, var9, var7, var3, 0);
					if (this.field343 >= var7) {
						this.field343 = var7;
						this.method805();
						this.remove();
					}
				}
			}
		}
	}

	@ObfuscatedName("a")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("d")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field348 > 0) {
			if (var1 >= this.field348) {
				if (this.field339 == Integer.MIN_VALUE) {
					this.field339 = 0;
					this.field347 = 0;
					this.field342 = 0;
					this.field341 = 0;
					this.remove();
					var1 = this.field348;
				}
				this.field348 = 0;
				this.method934();
			} else {
				this.field341 += this.field350 * var1;
				this.field342 += this.field340 * var1;
				this.field347 += this.field351 * var1;
				this.field348 -= var1;
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
		if (this.field343 < 0) {
			if (this.field338 <= 0) {
				this.method805();
				this.remove();
				return;
			}
			this.field343 = 0;
		}
		if (this.field343 >= var5) {
			if (this.field338 >= 0) {
				this.method805();
				this.remove();
				return;
			}
			this.field343 = var5 - 1;
		}
		this.field343 += this.field338 * var1;
		if (this.numLoops < 0) {
			if (!this.field349) {
				if (this.field338 < 0) {
					if (this.field343 >= var3) {
						return;
					}
					this.field343 = var4 - 1 - (var4 - 1 - this.field343) % var6;
				} else {
					if (this.field343 < var4) {
						return;
					}
					this.field343 = var3 + (this.field343 - var3) % var6;
				}
			} else {
				if (this.field338 < 0) {
					if (this.field343 >= var3) {
						return;
					}
					this.field343 = var3 + var3 - 1 - this.field343;
					this.field338 = -this.field338;
				}
				while (this.field343 >= var4) {
					this.field343 = var4 + var4 - 1 - this.field343;
					this.field338 = -this.field338;
					if (this.field343 >= var3) {
						return;
					}
					this.field343 = var3 + var3 - 1 - this.field343;
					this.field338 = -this.field338;
				} 
			}
		} else {
			if (this.numLoops > 0) {
				if (this.field349) {
					label129 : {
						if (this.field338 < 0) {
							if (this.field343 >= var3) {
								return;
							}
							this.field343 = var3 + var3 - 1 - this.field343;
							this.field338 = -this.field338;
							if (--this.numLoops == 0) {
								break label129;
							}
						}
						do {
							if (this.field343 < var4) {
								return;
							}
							this.field343 = var4 + var4 - 1 - this.field343;
							this.field338 = -this.field338;
							if (--this.numLoops == 0) {
								break;
							}
							if (this.field343 >= var3) {
								return;
							}
							this.field343 = var3 + var3 - 1 - this.field343;
							this.field338 = -this.field338;
						} while (--this.numLoops != 0 );
					}
				} else {
					label161 : {
						int var7;
						if (this.field338 < 0) {
							if (this.field343 >= var3) {
								return;
							}
							var7 = (var4 - 1 - this.field343) / var6;
							if (var7 >= this.numLoops) {
								this.field343 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}
							this.field343 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field343 < var4) {
								return;
							}
							var7 = (this.field343 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field343 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}
							this.field343 -= var6 * var7;
							this.numLoops -= var7;
						}
						return;
					}
				}
			}
			if (this.field338 < 0) {
				if (this.field343 < 0) {
					this.field343 = -1;
					this.method805();
					this.remove();
				}
			} else if (this.field343 >= var5) {
				this.field343 = var5;
				this.method805();
				this.remove();
			}
		}
	}

	@ObfuscatedName("n")
	public synchronized void method798(int var1) {
		this.method894(var1 << 6, this.method840());
	}

	@ObfuscatedName("x")
	synchronized void method814(int var1) {
		this.method894(var1, this.method840());
	}

	@ObfuscatedName("g")
	synchronized void method894(int var1, int var2) {
		this.field339 = var1;
		this.field337 = var2;
		this.field348 = 0;
		this.method934();
	}

	@ObfuscatedName("p")
	public synchronized int method810() {
		return this.field339 == Integer.MIN_VALUE ? 0 : this.field339;
	}

	@ObfuscatedName("b")
	public synchronized int method840() {
		return this.field337 < 0 ? -1 : this.field337;
	}

	@ObfuscatedName("l")
	public synchronized void method816(int var1) {
		int var2 = ((RawSound) (super.sound)).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}
		if (var1 > var2) {
			var1 = var2;
		}
		this.field343 = var1;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Z)V", garbageValue = "1")
	public synchronized void method815() {
		this.field338 = (this.field338 ^ this.field338 >> 31) + (this.field338 >>> 31);
		this.field338 = -this.field338;
	}

	@ObfuscatedName("k")
	void method805() {
		if (this.field348 != 0) {
			if (this.field339 == Integer.MIN_VALUE) {
				this.field339 = 0;
			}
			this.field348 = 0;
			this.method934();
		}
	}

	@ObfuscatedName("v")
	public synchronized void method806(int var1, int var2) {
		this.method807(var1, var2, this.method840());
	}

	@ObfuscatedName("t")
	public synchronized void method807(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method894(var2, var3);
		} else {
			int var4 = method880(var2, var3);
			int var5 = method916(var2, var3);
			if (var4 == this.field342 && var5 == this.field347) {
				this.field348 = 0;
			} else {
				int var6 = var2 - this.field341;
				if (this.field341 - var2 > var6) {
					var6 = this.field341 - var2;
				}
				if (var4 - this.field342 > var6) {
					var6 = var4 - this.field342;
				}
				if (this.field342 - var4 > var6) {
					var6 = this.field342 - var4;
				}
				if (var5 - this.field347 > var6) {
					var6 = var5 - this.field347;
				}
				if (this.field347 - var5 > var6) {
					var6 = this.field347 - var5;
				}
				if (var1 > var6) {
					var1 = var6;
				}
				this.field348 = var1;
				this.field339 = var2;
				this.field337 = var3;
				this.field350 = (var2 - this.field341) / var1;
				this.field340 = (var4 - this.field342) / var1;
				this.field351 = (var5 - this.field347) / var1;
			}
		}
	}

	@ObfuscatedName("e")
	public synchronized void method823(int var1) {
		if (var1 == 0) {
			this.method814(0);
			this.remove();
		} else if (this.field342 == 0 && this.field347 == 0) {
			this.field348 = 0;
			this.field339 = 0;
			this.field341 = 0;
			this.remove();
		} else {
			int var2 = -this.field341;
			if (this.field341 > var2) {
				var2 = this.field341;
			}
			if (-this.field342 > var2) {
				var2 = -this.field342;
			}
			if (this.field342 > var2) {
				var2 = this.field342;
			}
			if (-this.field347 > var2) {
				var2 = -this.field347;
			}
			if (this.field347 > var2) {
				var2 = this.field347;
			}
			if (var1 > var2) {
				var1 = var2;
			}
			this.field348 = var1;
			this.field339 = Integer.MIN_VALUE;
			this.field350 = -this.field341 / var1;
			this.field340 = -this.field342 / var1;
			this.field351 = -this.field347 / var1;
		}
	}

	@ObfuscatedName("s")
	public synchronized void method809(int var1) {
		if (this.field338 < 0) {
			this.field338 = -var1;
		} else {
			this.field338 = var1;
		}
	}

	@ObfuscatedName("i")
	public synchronized int method844() {
		return this.field338 < 0 ? -this.field338 : this.field338;
	}

	@ObfuscatedName("r")
	public boolean method859() {
		return this.field343 < 0 || this.field343 >= ((RawSound) (super.sound)).samples.length << 8;
	}

	@ObfuscatedName("al")
	public boolean method908() {
		return this.field348 != 0;
	}

	@ObfuscatedName("aw")
	int method818(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field348 > 0) {
				int var6 = var2 + this.field348;
				if (var6 > var4) {
					var6 = var4;
				}
				this.field348 += var2;
				if (this.field338 == 256 && (this.field343 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method937(0, ((RawSound) (super.sound)).samples, var1, this.field343, var2, this.field342, this.field347, this.field340, this.field351, 0, var6, var3, this);
					} else {
						var2 = method829(((RawSound) (super.sound)).samples, var1, this.field343, var2, this.field341, this.field350, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method834(0, 0, ((RawSound) (super.sound)).samples, var1, this.field343, var2, this.field342, this.field347, this.field340, this.field351, 0, var6, var3, this, this.field338, var5);
				} else {
					var2 = method833(0, 0, ((RawSound) (super.sound)).samples, var1, this.field343, var2, this.field341, this.field350, 0, var6, var3, this, this.field338, var5);
				}
				this.field348 -= var2;
				if (this.field348 != 0) {
					return var2;
				}
				if (!this.method820()) {
					continue;
				}
				return var4;
			}
			if (this.field338 == 256 && (this.field343 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method796(0, ((RawSound) (super.sound)).samples, var1, this.field343, var2, this.field342, this.field347, 0, var4, var3, this);
				}
				return method821(((RawSound) (super.sound)).samples, var1, this.field343, var2, this.field341, 0, var4, var3, this);
			}
			if (PcmPlayer.PcmPlayer_stereo) {
				return method826(0, 0, ((RawSound) (super.sound)).samples, var1, this.field343, var2, this.field342, this.field347, 0, var4, var3, this, this.field338, var5);
			}
			return method825(0, 0, ((RawSound) (super.sound)).samples, var1, this.field343, var2, this.field341, 0, var4, var3, this, this.field338, var5);
		} 
	}

	@ObfuscatedName("at")
	int vmethod959() {
		int var1 = this.field341 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field343 / (((RawSound) (super.sound)).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound) (super.sound)).samples.length;
		}
		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("aq")
	int method819(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field348 > 0) {
				int var6 = var2 + this.field348;
				if (var6 > var4) {
					var6 = var4;
				}
				this.field348 += var2;
				if (this.field338 == -256 && (this.field343 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method832(0, ((RawSound) (super.sound)).samples, var1, this.field343, var2, this.field342, this.field347, this.field340, this.field351, 0, var6, var3, this);
					} else {
						var2 = method831(((RawSound) (super.sound)).samples, var1, this.field343, var2, this.field341, this.field350, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method836(0, 0, ((RawSound) (super.sound)).samples, var1, this.field343, var2, this.field342, this.field347, this.field340, this.field351, 0, var6, var3, this, this.field338, var5);
				} else {
					var2 = method835(0, 0, ((RawSound) (super.sound)).samples, var1, this.field343, var2, this.field341, this.field350, 0, var6, var3, this, this.field338, var5);
				}
				this.field348 -= var2;
				if (this.field348 != 0) {
					return var2;
				}
				if (!this.method820()) {
					continue;
				}
				return var4;
			}
			if (this.field338 == -256 && (this.field343 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method824(0, ((RawSound) (super.sound)).samples, var1, this.field343, var2, this.field342, this.field347, 0, var4, var3, this);
				}
				return method869(((RawSound) (super.sound)).samples, var1, this.field343, var2, this.field341, 0, var4, var3, this);
			}
			if (PcmPlayer.PcmPlayer_stereo) {
				return method828(0, 0, ((RawSound) (super.sound)).samples, var1, this.field343, var2, this.field342, this.field347, 0, var4, var3, this, this.field338, var5);
			}
			return method827(0, 0, ((RawSound) (super.sound)).samples, var1, this.field343, var2, this.field341, 0, var4, var3, this, this.field338, var5);
		} 
	}

	@ObfuscatedName("ax")
	boolean method820() {
		int var1 = this.field339;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method880(var1, this.field337);
			var3 = method916(var1, this.field337);
		}
		if (var1 == this.field341 && var2 == this.field342 && var3 == this.field347) {
			if (this.field339 == Integer.MIN_VALUE) {
				this.field339 = 0;
				this.field347 = 0;
				this.field342 = 0;
				this.field341 = 0;
				this.remove();
				return true;
			} else {
				this.method934();
				return false;
			}
		} else {
			if (this.field341 < var1) {
				this.field350 = 1;
				this.field348 = var1 - this.field341;
			} else if (this.field341 > var1) {
				this.field350 = -1;
				this.field348 = this.field341 - var1;
			} else {
				this.field350 = 0;
			}
			if (this.field342 < var2) {
				this.field340 = 1;
				if (this.field348 == 0 || this.field348 > var2 - this.field342) {
					this.field348 = var2 - this.field342;
				}
			} else if (this.field342 > var2) {
				this.field340 = -1;
				if (this.field348 == 0 || this.field348 > this.field342 - var2) {
					this.field348 = this.field342 - var2;
				}
			} else {
				this.field340 = 0;
			}
			if (this.field347 < var3) {
				this.field351 = 1;
				if (this.field348 == 0 || this.field348 > var3 - this.field347) {
					this.field348 = var3 - this.field347;
				}
			} else if (this.field347 > var3) {
				this.field351 = -1;
				if (this.field348 == 0 || this.field348 > this.field347 - var3) {
					this.field348 = this.field347 - var3;
				}
			} else {
				this.field351 = 0;
			}
			return false;
		}
	}

	@ObfuscatedName("o")
	static int method880(int var0, int var1) {
		return var1 < 0 ? var0 : ((int) (((double) (var0)) * Math.sqrt(((double) (16384 - var1)) * 1.220703125E-4) + 0.5));
	}

	@ObfuscatedName("q")
	static int method916(int var0, int var1) {
		return var1 < 0 ? -var0 : ((int) (((double) (var0)) * Math.sqrt(((double) (var1)) * 1.220703125E-4) + 0.5));
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lap;II)Lav;")
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, ((int) (((long) (var0.sampleRate)) * 256L * ((long) (var1)) / ((long) (class301.field3595 * 100)))), var2 << 6) : null;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lap;III)Lav;")
	public static RawPcmStream method795(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = "([B[IIIIIIILav;)I")
	static int method821(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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
		var8.field343 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(descriptor = "(I[B[IIIIIIIILav;)I")
	static int method796(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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
		var10.field343 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = "([B[IIIIIIILav;)I")
	static int method869(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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
		var8.field343 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "(I[B[IIIIIIIILav;)I")
	static int method824(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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
		var10.field343 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIILav;II)I")
	static int method825(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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
		var10.field343 = var4;
		return var5;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIIILav;II)I")
	static int method826(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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
		var11.field343 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIILav;II)I")
	static int method827(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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
		var10.field343 = var4;
		return var5;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIIILav;II)I")
	static int method828(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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
		var11.field343 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "([B[IIIIIIIILav;)I")
	static int method829(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}
		var9.field342 += var9.field340 * (var6 - var3);
		var9.field347 += var9.field351 * (var6 - var3);
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
		var9.field341 = var4 >> 2;
		var9.field343 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = "(I[B[IIIIIIIIIILav;)I")
	static int method937(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}
		var12.field341 += var12.field350 * (var9 - var4);
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
		var12.field342 = var5 >> 2;
		var12.field347 = var6 >> 2;
		var12.field343 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(descriptor = "([B[IIIIIIIILav;)I")
	static int method831(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}
		var9.field342 += var9.field340 * (var6 - var3);
		var9.field347 += var9.field351 * (var6 - var3);
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
		var9.field341 = var4 >> 2;
		var9.field343 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(descriptor = "(I[B[IIIIIIIIIILav;)I")
	static int method832(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}
		var12.field341 += var12.field350 * (var9 - var4);
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
		var12.field342 = var5 >> 2;
		var12.field347 = var6 >> 2;
		var12.field343 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIIILav;II)I")
	static int method833(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field342 -= var11.field340 * var5;
		var11.field347 -= var11.field351 * var5;
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
		var11.field342 += var11.field340 * var5;
		var11.field347 += var11.field351 * var5;
		var11.field341 = var6;
		var11.field343 = var4;
		return var5;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIIIIILav;II)I")
	static int method834(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field341 -= var5 * var13.field350;
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
		var13.field341 += var13.field350 * var5;
		var13.field342 = var6;
		var13.field347 = var7;
		var13.field343 = var4;
		return var5;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIIILav;II)I")
	static int method835(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field342 -= var11.field340 * var5;
		var11.field347 -= var11.field351 * var5;
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
		var11.field342 += var11.field340 * var5;
		var11.field347 += var11.field351 * var5;
		var11.field341 = var6;
		var11.field343 = var4;
		return var5;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIIIIILav;II)I")
	static int method836(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field341 -= var5 * var13.field350;
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
		var13.field341 += var13.field350 * var5;
		var13.field342 = var6;
		var13.field347 = var7;
		var13.field343 = var4;
		return var5;
	}
}