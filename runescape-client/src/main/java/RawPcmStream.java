import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("an")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("s")
	int field347;

	@ObfuscatedName("h")
	int field334;

	@ObfuscatedName("v")
	int field336;

	@ObfuscatedName("c")
	int field335;

	@ObfuscatedName("q")
	int field337;

	@ObfuscatedName("i")
	int field338;

	@ObfuscatedName("k")
	int field339;

	@ObfuscatedName("o")
	@Export("numLoops")
	int numLoops;

	@ObfuscatedName("n")
	@Export("start")
	int start;

	@ObfuscatedName("d")
	@Export("end")
	int end;

	@ObfuscatedName("a")
	boolean field333;

	@ObfuscatedName("m")
	int field344;

	@ObfuscatedName("u")
	int field345;

	@ObfuscatedName("l")
	int field346;

	@ObfuscatedName("z")
	int field340;

	@ObfuscatedSignature(descriptor = "(Lag;III)V")
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field333 = var1.field264;
		this.field334 = var2;
		this.field336 = var3;
		this.field335 = var4;
		this.field347 = 0;
		this.method770();
	}

	@ObfuscatedSignature(descriptor = "(Lag;II)V")
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field333 = var1.field264;
		this.field334 = var2;
		this.field336 = var3;
		this.field335 = 8192;
		this.field347 = 0;
		this.method770();
	}

	@ObfuscatedName("c")
	void method770() {
		this.field337 = this.field336;
		this.field338 = method904(this.field336, this.field335);
		this.field339 = method777(this.field336, this.field335);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "()Lah;")
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "()Lah;")
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("k")
	protected int vmethod5396() {
		return this.field336 == 0 && this.field344 == 0 ? 0 : 1;
	}

	@ObfuscatedName("o")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field336 == 0 && this.field344 == 0) {
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
			if (this.field347 < 0) {
				if (this.field334 <= 0) {
					this.method844();
					this.remove();
					return;
				}
				this.field347 = 0;
			}
			if (this.field347 >= var7) {
				if (this.field334 >= 0) {
					this.method844();
					this.remove();
					return;
				}
				this.field347 = var7 - 1;
			}
			if (this.numLoops < 0) {
				if (this.field333) {
					if (this.field334 < 0) {
						var9 = this.method772(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field347 >= var5) {
							return;
						}
						this.field347 = var5 + var5 - 1 - this.field347;
						this.field334 = -this.field334;
					}
					while (true) {
						var9 = this.method851(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field347 < var6) {
							return;
						}
						this.field347 = var6 + var6 - 1 - this.field347;
						this.field334 = -this.field334;
						var9 = this.method772(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field347 >= var5) {
							return;
						}
						this.field347 = var5 + var5 - 1 - this.field347;
						this.field334 = -this.field334;
					} 
				} else if (this.field334 < 0) {
					while (true) {
						var9 = this.method772(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field347 >= var5) {
							return;
						}
						this.field347 = var6 - 1 - (var6 - 1 - this.field347) % var8;
					} 
				} else {
					while (true) {
						var9 = this.method851(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field347 < var6) {
							return;
						}
						this.field347 = var5 + (this.field347 - var5) % var8;
					} 
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field333) {
						label127 : {
							if (this.field334 < 0) {
								var9 = this.method772(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field347 >= var5) {
									return;
								}
								this.field347 = var5 + var5 - 1 - this.field347;
								this.field334 = -this.field334;
								if (--this.numLoops == 0) {
									break label127;
								}
							}
							do {
								var9 = this.method851(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field347 < var6) {
									return;
								}
								this.field347 = var6 + var6 - 1 - this.field347;
								this.field334 = -this.field334;
								if (--this.numLoops == 0) {
									break;
								}
								var9 = this.method772(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field347 >= var5) {
									return;
								}
								this.field347 = var5 + var5 - 1 - this.field347;
								this.field334 = -this.field334;
							} while (--this.numLoops != 0 );
						}
					} else {
						int var10;
						if (this.field334 < 0) {
							while (true) {
								var9 = this.method772(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field347 >= var5) {
									return;
								}
								var10 = (var6 - 1 - this.field347) / var8;
								if (var10 >= this.numLoops) {
									this.field347 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}
								this.field347 += var8 * var10;
								this.numLoops -= var10;
							} 
						} else {
							while (true) {
								var9 = this.method851(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field347 < var6) {
									return;
								}
								var10 = (this.field347 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field347 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}
								this.field347 -= var8 * var10;
								this.numLoops -= var10;
							} 
						}
					}
				}
				if (this.field334 < 0) {
					this.method772(var1, var9, 0, var3, 0);
					if (this.field347 < 0) {
						this.field347 = -1;
						this.method844();
						this.remove();
					}
				} else {
					this.method851(var1, var9, var7, var3, 0);
					if (this.field347 >= var7) {
						this.field347 = var7;
						this.method844();
						this.remove();
					}
				}
			}
		}
	}

	@ObfuscatedName("n")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("d")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field344 > 0) {
			if (var1 >= this.field344) {
				if (this.field336 == Integer.MIN_VALUE) {
					this.field336 = 0;
					this.field339 = 0;
					this.field338 = 0;
					this.field337 = 0;
					this.remove();
					var1 = this.field344;
				}
				this.field344 = 0;
				this.method770();
			} else {
				this.field337 += this.field345 * var1;
				this.field338 += this.field346 * var1;
				this.field339 += this.field340 * var1;
				this.field344 -= var1;
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
		if (this.field347 < 0) {
			if (this.field334 <= 0) {
				this.method844();
				this.remove();
				return;
			}
			this.field347 = 0;
		}
		if (this.field347 >= var5) {
			if (this.field334 >= 0) {
				this.method844();
				this.remove();
				return;
			}
			this.field347 = var5 - 1;
		}
		this.field347 += this.field334 * var1;
		if (this.numLoops < 0) {
			if (!this.field333) {
				if (this.field334 < 0) {
					if (this.field347 >= var3) {
						return;
					}
					this.field347 = var4 - 1 - (var4 - 1 - this.field347) % var6;
				} else {
					if (this.field347 < var4) {
						return;
					}
					this.field347 = var3 + (this.field347 - var3) % var6;
				}
			} else {
				if (this.field334 < 0) {
					if (this.field347 >= var3) {
						return;
					}
					this.field347 = var3 + var3 - 1 - this.field347;
					this.field334 = -this.field334;
				}
				while (this.field347 >= var4) {
					this.field347 = var4 + var4 - 1 - this.field347;
					this.field334 = -this.field334;
					if (this.field347 >= var3) {
						return;
					}
					this.field347 = var3 + var3 - 1 - this.field347;
					this.field334 = -this.field334;
				} 
			}
		} else {
			if (this.numLoops > 0) {
				if (this.field333) {
					label129 : {
						if (this.field334 < 0) {
							if (this.field347 >= var3) {
								return;
							}
							this.field347 = var3 + var3 - 1 - this.field347;
							this.field334 = -this.field334;
							if (--this.numLoops == 0) {
								break label129;
							}
						}
						do {
							if (this.field347 < var4) {
								return;
							}
							this.field347 = var4 + var4 - 1 - this.field347;
							this.field334 = -this.field334;
							if (--this.numLoops == 0) {
								break;
							}
							if (this.field347 >= var3) {
								return;
							}
							this.field347 = var3 + var3 - 1 - this.field347;
							this.field334 = -this.field334;
						} while (--this.numLoops != 0 );
					}
				} else {
					label161 : {
						int var7;
						if (this.field334 < 0) {
							if (this.field347 >= var3) {
								return;
							}
							var7 = (var4 - 1 - this.field347) / var6;
							if (var7 >= this.numLoops) {
								this.field347 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}
							this.field347 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field347 < var4) {
								return;
							}
							var7 = (this.field347 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field347 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}
							this.field347 -= var6 * var7;
							this.numLoops -= var7;
						}
						return;
					}
				}
			}
			if (this.field334 < 0) {
				if (this.field347 < 0) {
					this.field347 = -1;
					this.method844();
					this.remove();
				}
			} else if (this.field347 >= var5) {
				this.field347 = var5;
				this.method844();
				this.remove();
			}
		}
	}

	@ObfuscatedName("a")
	public synchronized void method836(int var1) {
		this.method860(var1 << 6, this.method776());
	}

	@ObfuscatedName("m")
	synchronized void method845(int var1) {
		this.method860(var1, this.method776());
	}

	@ObfuscatedName("u")
	synchronized void method860(int var1, int var2) {
		this.field336 = var1;
		this.field335 = var2;
		this.field344 = 0;
		this.method770();
	}

	@ObfuscatedName("l")
	public synchronized int method775() {
		return this.field336 == Integer.MIN_VALUE ? 0 : this.field336;
	}

	@ObfuscatedName("z")
	public synchronized int method776() {
		return this.field335 < 0 ? -1 : this.field335;
	}

	@ObfuscatedName("r")
	public synchronized void method793(int var1) {
		int var2 = ((RawSound) (super.sound)).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}
		if (var1 > var2) {
			var1 = var2;
		}
		this.field347 = var1;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Z)V", garbageValue = "1")
	public synchronized void method778() {
		this.field334 = (this.field334 ^ this.field334 >> 31) + (this.field334 >>> 31);
		this.field334 = -this.field334;
	}

	@ObfuscatedName("p")
	void method844() {
		if (this.field344 != 0) {
			if (this.field336 == Integer.MIN_VALUE) {
				this.field336 = 0;
			}
			this.field344 = 0;
			this.method770();
		}
	}

	@ObfuscatedName("e")
	public synchronized void method780(int var1, int var2) {
		this.method781(var1, var2, this.method776());
	}

	@ObfuscatedName("b")
	public synchronized void method781(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method860(var2, var3);
		} else {
			int var4 = method904(var2, var3);
			int var5 = method777(var2, var3);
			if (var4 == this.field338 && var5 == this.field339) {
				this.field344 = 0;
			} else {
				int var6 = var2 - this.field337;
				if (this.field337 - var2 > var6) {
					var6 = this.field337 - var2;
				}
				if (var4 - this.field338 > var6) {
					var6 = var4 - this.field338;
				}
				if (this.field338 - var4 > var6) {
					var6 = this.field338 - var4;
				}
				if (var5 - this.field339 > var6) {
					var6 = var5 - this.field339;
				}
				if (this.field339 - var5 > var6) {
					var6 = this.field339 - var5;
				}
				if (var1 > var6) {
					var1 = var6;
				}
				this.field344 = var1;
				this.field336 = var2;
				this.field335 = var3;
				this.field345 = (var2 - this.field337) / var1;
				this.field346 = (var4 - this.field338) / var1;
				this.field340 = (var5 - this.field339) / var1;
			}
		}
	}

	@ObfuscatedName("x")
	public synchronized void method782(int var1) {
		if (var1 == 0) {
			this.method845(0);
			this.remove();
		} else if (this.field338 == 0 && this.field339 == 0) {
			this.field344 = 0;
			this.field336 = 0;
			this.field337 = 0;
			this.remove();
		} else {
			int var2 = -this.field337;
			if (this.field337 > var2) {
				var2 = this.field337;
			}
			if (-this.field338 > var2) {
				var2 = -this.field338;
			}
			if (this.field338 > var2) {
				var2 = this.field338;
			}
			if (-this.field339 > var2) {
				var2 = -this.field339;
			}
			if (this.field339 > var2) {
				var2 = this.field339;
			}
			if (var1 > var2) {
				var1 = var2;
			}
			this.field344 = var1;
			this.field336 = Integer.MIN_VALUE;
			this.field345 = -this.field337 / var1;
			this.field346 = -this.field338 / var1;
			this.field340 = -this.field339 / var1;
		}
	}

	@ObfuscatedName("f")
	public synchronized void method808(int var1) {
		if (this.field334 < 0) {
			this.field334 = -var1;
		} else {
			this.field334 = var1;
		}
	}

	@ObfuscatedName("t")
	public synchronized int method784() {
		return this.field334 < 0 ? -this.field334 : this.field334;
	}

	@ObfuscatedName("j")
	public boolean method785() {
		return this.field347 < 0 || this.field347 >= ((RawSound) (super.sound)).samples.length << 8;
	}

	@ObfuscatedName("as")
	public boolean method820() {
		return this.field344 != 0;
	}

	@ObfuscatedName("ay")
	int method851(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field344 > 0) {
				int var6 = var2 + this.field344;
				if (var6 > var4) {
					var6 = var4;
				}
				this.field344 += var2;
				if (this.field334 == 256 && (this.field347 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method837(0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field338, this.field339, this.field346, this.field340, 0, var6, var3, this);
					} else {
						var2 = method803(((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field337, this.field345, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method849(0, 0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field338, this.field339, this.field346, this.field340, 0, var6, var3, this, this.field334, var5);
				} else {
					var2 = method792(0, 0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field337, this.field345, 0, var6, var3, this, this.field334, var5);
				}
				this.field344 -= var2;
				if (this.field344 != 0) {
					return var2;
				}
				if (!this.method794()) {
					continue;
				}
				return var4;
			}
			if (this.field334 == 256 && (this.field347 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method916(0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field338, this.field339, 0, var4, var3, this);
				}
				return method795(((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field337, 0, var4, var3, this);
			}
			if (PcmPlayer.PcmPlayer_stereo) {
				return method800(0, 0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field338, this.field339, 0, var4, var3, this, this.field334, var5);
			}
			return method799(0, 0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field337, 0, var4, var3, this, this.field334, var5);
		} 
	}

	@ObfuscatedName("ag")
	int method772(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field344 > 0) {
				int var6 = var2 + this.field344;
				if (var6 > var4) {
					var6 = var4;
				}
				this.field344 += var2;
				if (this.field334 == -256 && (this.field347 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method806(0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field338, this.field339, this.field346, this.field340, 0, var6, var3, this);
					} else {
						var2 = method805(((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field337, this.field345, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method810(0, 0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field338, this.field339, this.field346, this.field340, 0, var6, var3, this, this.field334, var5);
				} else {
					var2 = method809(0, 0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field337, this.field345, 0, var6, var3, this, this.field334, var5);
				}
				this.field344 -= var2;
				if (this.field344 != 0) {
					return var2;
				}
				if (!this.method794()) {
					continue;
				}
				return var4;
			}
			if (this.field334 == -256 && (this.field347 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method870(0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field338, this.field339, 0, var4, var3, this);
				}
				return method764(((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field337, 0, var4, var3, this);
			}
			if (PcmPlayer.PcmPlayer_stereo) {
				return method802(0, 0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field338, this.field339, 0, var4, var3, this, this.field334, var5);
			}
			return method910(0, 0, ((RawSound) (super.sound)).samples, var1, this.field347, var2, this.field337, 0, var4, var3, this, this.field334, var5);
		} 
	}

	@ObfuscatedName("az")
	int vmethod920() {
		int var1 = this.field337 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field347 / (((RawSound) (super.sound)).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound) (super.sound)).samples.length;
		}
		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("an")
	boolean method794() {
		int var1 = this.field336;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method904(var1, this.field335);
			var3 = method777(var1, this.field335);
		}
		if (var1 == this.field337 && var2 == this.field338 && var3 == this.field339) {
			if (this.field336 == Integer.MIN_VALUE) {
				this.field336 = 0;
				this.field339 = 0;
				this.field338 = 0;
				this.field337 = 0;
				this.remove();
				return true;
			} else {
				this.method770();
				return false;
			}
		} else {
			if (this.field337 < var1) {
				this.field345 = 1;
				this.field344 = var1 - this.field337;
			} else if (this.field337 > var1) {
				this.field345 = -1;
				this.field344 = this.field337 - var1;
			} else {
				this.field345 = 0;
			}
			if (this.field338 < var2) {
				this.field346 = 1;
				if (this.field344 == 0 || this.field344 > var2 - this.field338) {
					this.field344 = var2 - this.field338;
				}
			} else if (this.field338 > var2) {
				this.field346 = -1;
				if (this.field344 == 0 || this.field344 > this.field338 - var2) {
					this.field344 = this.field338 - var2;
				}
			} else {
				this.field346 = 0;
			}
			if (this.field339 < var3) {
				this.field340 = 1;
				if (this.field344 == 0 || this.field344 > var3 - this.field339) {
					this.field344 = var3 - this.field339;
				}
			} else if (this.field339 > var3) {
				this.field340 = -1;
				if (this.field344 == 0 || this.field344 > this.field339 - var3) {
					this.field344 = this.field339 - var3;
				}
			} else {
				this.field340 = 0;
			}
			return false;
		}
	}

	@ObfuscatedName("s")
	static int method904(int var0, int var1) {
		return var1 < 0 ? var0 : ((int) (((double) (var0)) * Math.sqrt(((double) (16384 - var1)) * 1.220703125E-4) + 0.5));
	}

	@ObfuscatedName("h")
	static int method777(int var0, int var1) {
		return var1 < 0 ? -var0 : ((int) (((double) (var0)) * Math.sqrt(((double) (var1)) * 1.220703125E-4) + 0.5));
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lag;II)Lan;")
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, ((int) (((long) (var0.sampleRate)) * 256L * ((long) (var1)) / ((long) (class344.field4152 * -2042134140)))), var2 << 6) : null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lag;III)Lan;")
	public static RawPcmStream method769(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = "([B[IIIIIIILan;)I")
	static int method795(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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
		var8.field347 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(descriptor = "(I[B[IIIIIIIILan;)I")
	static int method916(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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
		var10.field347 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = "([B[IIIIIIILan;)I")
	static int method764(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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
		var8.field347 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(descriptor = "(I[B[IIIIIIIILan;)I")
	static int method870(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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
		var10.field347 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIILan;II)I")
	static int method799(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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
		var10.field347 = var4;
		return var5;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIIILan;II)I")
	static int method800(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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
		var11.field347 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIILan;II)I")
	static int method910(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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
		var10.field347 = var4;
		return var5;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIIILan;II)I")
	static int method802(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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
		var11.field347 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(descriptor = "([B[IIIIIIIILan;)I")
	static int method803(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}
		var9.field338 += var9.field346 * (var6 - var3);
		var9.field339 += var9.field340 * (var6 - var3);
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
		var9.field337 = var4 >> 2;
		var9.field347 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(descriptor = "(I[B[IIIIIIIIIILan;)I")
	static int method837(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}
		var12.field337 += var12.field345 * (var9 - var4);
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
		var12.field338 = var5 >> 2;
		var12.field339 = var6 >> 2;
		var12.field347 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(descriptor = "([B[IIIIIIIILan;)I")
	static int method805(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}
		var9.field338 += var9.field346 * (var6 - var3);
		var9.field339 += var9.field340 * (var6 - var3);
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
		var9.field337 = var4 >> 2;
		var9.field347 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(descriptor = "(I[B[IIIIIIIIIILan;)I")
	static int method806(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}
		var12.field337 += var12.field345 * (var9 - var4);
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
		var12.field338 = var5 >> 2;
		var12.field339 = var6 >> 2;
		var12.field347 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIIILan;II)I")
	static int method792(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field338 -= var11.field346 * var5;
		var11.field339 -= var11.field340 * var5;
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
		var11.field338 += var11.field346 * var5;
		var11.field339 += var11.field340 * var5;
		var11.field337 = var6;
		var11.field347 = var4;
		return var5;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIIIIILan;II)I")
	static int method849(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field337 -= var5 * var13.field345;
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
		var13.field337 += var13.field345 * var5;
		var13.field338 = var6;
		var13.field339 = var7;
		var13.field347 = var4;
		return var5;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIIILan;II)I")
	static int method809(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field338 -= var11.field346 * var5;
		var11.field339 -= var11.field340 * var5;
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
		var11.field338 += var11.field346 * var5;
		var11.field339 += var11.field340 * var5;
		var11.field337 = var6;
		var11.field347 = var4;
		return var5;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(descriptor = "(II[B[IIIIIIIIIILan;II)I")
	static int method810(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field337 -= var5 * var13.field345;
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
		var13.field337 += var13.field345 * var5;
		var13.field338 = var6;
		var13.field339 = var7;
		var13.field347 = var4;
		return var5;
	}
}