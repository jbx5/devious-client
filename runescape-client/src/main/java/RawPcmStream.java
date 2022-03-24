import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("v")
	int field338;
	@ObfuscatedName("o")
	int field335;
	@ObfuscatedName("h")
	int field334;
	@ObfuscatedName("g")
	int field339;
	@ObfuscatedName("l")
	int field337;
	@ObfuscatedName("n")
	int field347;
	@ObfuscatedName("d")
	int field340;
	@ObfuscatedName("f")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("u")
	@Export("start")
	int start;
	@ObfuscatedName("r")
	@Export("end")
	int end;
	@ObfuscatedName("k")
	boolean field344;
	@ObfuscatedName("x")
	int field345;
	@ObfuscatedName("c")
	int field346;
	@ObfuscatedName("j")
	int field336;
	@ObfuscatedName("p")
	int field348;

	@ObfuscatedSignature(descriptor = 
	"(Laj;III)V")

	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field344 = var1.field266;
		this.field335 = var2;
		this.field334 = var3;
		this.field339 = var4;
		this.field338 = 0;
		this.method816();
	}

	@ObfuscatedSignature(descriptor = 
	"(Laj;II)V")

	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field344 = var1.field266;
		this.field335 = var2;
		this.field334 = var3;
		this.field339 = 8192;
		this.field338 = 0;
		this.method816();
	}

	@ObfuscatedName("l")
	void method816() {
		this.field337 = this.field334;
		this.field347 = method884(this.field334, this.field339);
		this.field340 = method812(this.field334, this.field339);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"()Lal;")

	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"()Lal;")

	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("f")
	protected int vmethod5476() {
		return (this.field334 == 0) && (this.field345 == 0) ? 0 : 1;
	}

	@ObfuscatedName("u")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if ((this.field334 == 0) && (this.field345 == 0)) {
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
			if (this.field338 < 0) {
				if (this.field335 <= 0) {
					this.method825();
					this.remove();
					return;
				}

				this.field338 = 0;
			}

			if (this.field338 >= var7) {
				if (this.field335 >= 0) {
					this.method825();
					this.remove();
					return;
				}

				this.field338 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field344) {
					if (this.field335 < 0) {
						var9 = this.method882(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field338 >= var5) {
							return;
						}

						this.field338 = ((var5 + var5) - 1) - this.field338;
						this.field335 = -this.field335;
					}

					while (true) {
						var9 = this.method905(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field338 < var6) {
							return;
						}

						this.field338 = ((var6 + var6) - 1) - this.field338;
						this.field335 = -this.field335;
						var9 = this.method882(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field338 >= var5) {
							return;
						}

						this.field338 = ((var5 + var5) - 1) - this.field338;
						this.field335 = -this.field335;
					} 
				} else if (this.field335 < 0) {
					while (true) {
						var9 = this.method882(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field338 >= var5) {
							return;
						}

						this.field338 = (var6 - 1) - (((var6 - 1) - this.field338) % var8);
					} 
				} else {
					while (true) {
						var9 = this.method905(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field338 < var6) {
							return;
						}

						this.field338 = var5 + ((this.field338 - var5) % var8);
					} 
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field344) {
						label127 : {
							if (this.field335 < 0) {
								var9 = this.method882(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field338 >= var5) {
									return;
								}

								this.field338 = ((var5 + var5) - 1) - this.field338;
								this.field335 = -this.field335;
								if ((--this.numLoops) == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method905(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field338 < var6) {
									return;
								}

								this.field338 = ((var6 + var6) - 1) - this.field338;
								this.field335 = -this.field335;
								if ((--this.numLoops) == 0) {
									break;
								}

								var9 = this.method882(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field338 >= var5) {
									return;
								}

								this.field338 = ((var5 + var5) - 1) - this.field338;
								this.field335 = -this.field335;
							} while ((--this.numLoops) != 0 );
						}
					} else {
						int var10;
						if (this.field335 < 0) {
							while (true) {
								var9 = this.method882(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field338 >= var5) {
									return;
								}

								var10 = ((var6 - 1) - this.field338) / var8;
								if (var10 >= this.numLoops) {
									this.field338 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field338 += var8 * var10;
								this.numLoops -= var10;
							} 
						} else {
							while (true) {
								var9 = this.method905(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field338 < var6) {
									return;
								}

								var10 = (this.field338 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field338 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field338 -= var8 * var10;
								this.numLoops -= var10;
							} 
						}
					}
				}

				if (this.field335 < 0) {
					this.method882(var1, var9, 0, var3, 0);
					if (this.field338 < 0) {
						this.field338 = -1;
						this.method825();
						this.remove();
					}
				} else {
					this.method905(var1, var9, var7, var3, 0);
					if (this.field338 >= var7) {
						this.field338 = var7;
						this.method825();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("r")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("k")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field345 > 0) {
			if (var1 >= this.field345) {
				if (this.field334 == Integer.MIN_VALUE) {
					this.field334 = 0;
					this.field340 = 0;
					this.field347 = 0;
					this.field337 = 0;
					this.remove();
					var1 = this.field345;
				}

				this.field345 = 0;
				this.method816();
			} else {
				this.field337 += this.field346 * var1;
				this.field347 += this.field336 * var1;
				this.field340 += this.field348 * var1;
				this.field345 -= var1;
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

		if (this.field338 < 0) {
			if (this.field335 <= 0) {
				this.method825();
				this.remove();
				return;
			}

			this.field338 = 0;
		}

		if (this.field338 >= var5) {
			if (this.field335 >= 0) {
				this.method825();
				this.remove();
				return;
			}

			this.field338 = var5 - 1;
		}

		this.field338 += this.field335 * var1;
		if (this.numLoops < 0) {
			if (!this.field344) {
				if (this.field335 < 0) {
					if (this.field338 >= var3) {
						return;
					}

					this.field338 = (var4 - 1) - (((var4 - 1) - this.field338) % var6);
				} else {
					if (this.field338 < var4) {
						return;
					}

					this.field338 = var3 + ((this.field338 - var3) % var6);
				}

			} else {
				if (this.field335 < 0) {
					if (this.field338 >= var3) {
						return;
					}

					this.field338 = ((var3 + var3) - 1) - this.field338;
					this.field335 = -this.field335;
				}

				while (this.field338 >= var4) {
					this.field338 = ((var4 + var4) - 1) - this.field338;
					this.field335 = -this.field335;
					if (this.field338 >= var3) {
						return;
					}

					this.field338 = ((var3 + var3) - 1) - this.field338;
					this.field335 = -this.field335;
				} 

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field344) {
					label129 : {
						if (this.field335 < 0) {
							if (this.field338 >= var3) {
								return;
							}

							this.field338 = ((var3 + var3) - 1) - this.field338;
							this.field335 = -this.field335;
							if ((--this.numLoops) == 0) {
								break label129;
							}
						}

						do {
							if (this.field338 < var4) {
								return;
							}

							this.field338 = ((var4 + var4) - 1) - this.field338;
							this.field335 = -this.field335;
							if ((--this.numLoops) == 0) {
								break;
							}

							if (this.field338 >= var3) {
								return;
							}

							this.field338 = ((var3 + var3) - 1) - this.field338;
							this.field335 = -this.field335;
						} while ((--this.numLoops) != 0 );
					}
				} else {
					label161 : {
						int var7;
						if (this.field335 < 0) {
							if (this.field338 >= var3) {
								return;
							}

							var7 = ((var4 - 1) - this.field338) / var6;
							if (var7 >= this.numLoops) {
								this.field338 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field338 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field338 < var4) {
								return;
							}

							var7 = (this.field338 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field338 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field338 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field335 < 0) {
				if (this.field338 < 0) {
					this.field338 = -1;
					this.method825();
					this.remove();
				}
			} else if (this.field338 >= var5) {
				this.field338 = var5;
				this.method825();
				this.remove();
			}

		}
	}

	@ObfuscatedName("x")
	public synchronized void method818(int var1) {
		this.method820(var1 << 6, this.method822());
	}

	@ObfuscatedName("c")
	synchronized void method819(int var1) {
		this.method820(var1, this.method822());
	}

	@ObfuscatedName("j")
	synchronized void method820(int var1, int var2) {
		this.field334 = var1;
		this.field339 = var2;
		this.field345 = 0;
		this.method816();
	}

	@ObfuscatedName("p")
	public synchronized int method865() {
		return this.field334 == Integer.MIN_VALUE ? 0 : this.field334;
	}

	@ObfuscatedName("s")
	public synchronized int method822() {
		return this.field339 < 0 ? -1 : this.field339;
	}

	@ObfuscatedName("b")
	public synchronized void method897(int var1) {
		int var2 = ((RawSound) (super.sound)).samples.length << 8;
		if (var1 < (-1)) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field338 = var1;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(Z)V", garbageValue = 
	"1")

	public synchronized void method824() {
		this.field335 = (this.field335 ^ (this.field335 >> 31)) + (this.field335 >>> 31);
		this.field335 = -this.field335;
	}

	@ObfuscatedName("a")
	void method825() {
		if (this.field345 != 0) {
			if (this.field334 == Integer.MIN_VALUE) {
				this.field334 = 0;
			}

			this.field345 = 0;
			this.method816();
		}

	}

	@ObfuscatedName("m")
	public synchronized void method826(int var1, int var2) {
		this.method841(var1, var2, this.method822());
	}

	@ObfuscatedName("q")
	public synchronized void method841(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method820(var2, var3);
		} else {
			int var4 = method884(var2, var3);
			int var5 = method812(var2, var3);
			if ((var4 == this.field347) && (var5 == this.field340)) {
				this.field345 = 0;
			} else {
				int var6 = var2 - this.field337;
				if ((this.field337 - var2) > var6) {
					var6 = this.field337 - var2;
				}

				if ((var4 - this.field347) > var6) {
					var6 = var4 - this.field347;
				}

				if ((this.field347 - var4) > var6) {
					var6 = this.field347 - var4;
				}

				if ((var5 - this.field340) > var6) {
					var6 = var5 - this.field340;
				}

				if ((this.field340 - var5) > var6) {
					var6 = this.field340 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field345 = var1;
				this.field334 = var2;
				this.field339 = var3;
				this.field346 = (var2 - this.field337) / var1;
				this.field336 = (var4 - this.field347) / var1;
				this.field348 = (var5 - this.field340) / var1;
			}
		}
	}

	@ObfuscatedName("y")
	public synchronized void method828(int var1) {
		if (var1 == 0) {
			this.method819(0);
			this.remove();
		} else if ((this.field347 == 0) && (this.field340 == 0)) {
			this.field345 = 0;
			this.field334 = 0;
			this.field337 = 0;
			this.remove();
		} else {
			int var2 = -this.field337;
			if (this.field337 > var2) {
				var2 = this.field337;
			}

			if ((-this.field347) > var2) {
				var2 = -this.field347;
			}

			if (this.field347 > var2) {
				var2 = this.field347;
			}

			if ((-this.field340) > var2) {
				var2 = -this.field340;
			}

			if (this.field340 > var2) {
				var2 = this.field340;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field345 = var1;
			this.field334 = Integer.MIN_VALUE;
			this.field346 = (-this.field337) / var1;
			this.field336 = (-this.field347) / var1;
			this.field348 = (-this.field340) / var1;
		}
	}

	@ObfuscatedName("z")
	public synchronized void method843(int var1) {
		if (this.field335 < 0) {
			this.field335 = -var1;
		} else {
			this.field335 = var1;
		}

	}

	@ObfuscatedName("e")
	public synchronized int method838() {
		return this.field335 < 0 ? -this.field335 : this.field335;
	}

	@ObfuscatedName("ae")
	public boolean method831() {
		return (this.field338 < 0) || (this.field338 >= (((RawSound) (super.sound)).samples.length << 8));
	}

	@ObfuscatedName("ab")
	public boolean method832() {
		return this.field345 != 0;
	}

	@ObfuscatedName("aj")
	int method905(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field345 > 0) {
				int var6 = var2 + this.field345;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field345 += var2;
				if ((this.field335 == 256) && ((this.field338 & 255) == 0)) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method850(0, ((RawSound) (super.sound)).samples, var1, this.field338, var2, this.field347, this.field340, this.field336, this.field348, 0, var6, var3, this);
					} else {
						var2 = method962(((RawSound) (super.sound)).samples, var1, this.field338, var2, this.field337, this.field346, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method854(0, 0, ((RawSound) (super.sound)).samples, var1, this.field338, var2, this.field347, this.field340, this.field336, this.field348, 0, var6, var3, this, this.field335, var5);
				} else {
					var2 = method821(0, 0, ((RawSound) (super.sound)).samples, var1, this.field338, var2, this.field337, this.field346, 0, var6, var3, this, this.field335, var5);
				}

				this.field345 -= var2;
				if (this.field345 != 0) {
					return var2;
				}

				if (!this.method840()) {
					continue;
				}

				return var4;
			}

			if ((this.field335 == 256) && ((this.field338 & 255) == 0)) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method842(0, ((RawSound) (super.sound)).samples, var1, this.field338, var2, this.field347, this.field340, 0, var4, var3, this);
				}

				return method879(((RawSound) (super.sound)).samples, var1, this.field338, var2, this.field337, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method846(0, 0, ((RawSound) (super.sound)).samples, var1, this.field338, var2, this.field347, this.field340, 0, var4, var3, this, this.field335, var5);
			}

			return method845(0, 0, ((RawSound) (super.sound)).samples, var1, this.field338, var2, this.field337, 0, var4, var3, this, this.field335, var5);
		} 
	}

	@ObfuscatedName("as")
	int method882(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field345 > 0) {
				int var6 = var2 + this.field345;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field345 += var2;
				if ((this.field335 == (-256)) && ((this.field338 & 255) == 0)) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method954(0, ((RawSound) (super.sound)).samples, var1, this.field338, var2, this.field347, this.field340, this.field336, this.field348, 0, var6, var3, this);
					} else {
						var2 = method851(((RawSound) (super.sound)).samples, var1, this.field338, var2, this.field337, this.field346, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method856(0, 0, ((RawSound) (super.sound)).samples, var1, this.field338, var2, this.field347, this.field340, this.field336, this.field348, 0, var6, var3, this, this.field335, var5);
				} else {
					var2 = method912(0, 0, ((RawSound) (super.sound)).samples, var1, this.field338, var2, this.field337, this.field346, 0, var6, var3, this, this.field335, var5);
				}

				this.field345 -= var2;
				if (this.field345 != 0) {
					return var2;
				}

				if (!this.method840()) {
					continue;
				}

				return var4;
			}

			if ((this.field335 == (-256)) && ((this.field338 & 255) == 0)) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method844(0, ((RawSound) (super.sound)).samples, var1, this.field338, var2, this.field347, this.field340, 0, var4, var3, this);
				}

				return method866(((RawSound) (super.sound)).samples, var1, this.field338, var2, this.field337, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method848(0, 0, ((RawSound) (super.sound)).samples, var1, this.field338, var2, this.field347, this.field340, 0, var4, var3, this, this.field335, var5);
			}

			return method847(0, 0, ((RawSound) (super.sound)).samples, var1, this.field338, var2, this.field337, 0, var4, var3, this, this.field335, var5);
		} 
	}

	@ObfuscatedName("ao")
	boolean method840() {
		int var1 = this.field334;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method884(var1, this.field339);
			var3 = method812(var1, this.field339);
		}

		if (((var1 == this.field337) && (var2 == this.field347)) && (var3 == this.field340)) {
			if (this.field334 == Integer.MIN_VALUE) {
				this.field334 = 0;
				this.field340 = 0;
				this.field347 = 0;
				this.field337 = 0;
				this.remove();
				return true;
			} else {
				this.method816();
				return false;
			}
		} else {
			if (this.field337 < var1) {
				this.field346 = 1;
				this.field345 = var1 - this.field337;
			} else if (this.field337 > var1) {
				this.field346 = -1;
				this.field345 = this.field337 - var1;
			} else {
				this.field346 = 0;
			}

			if (this.field347 < var2) {
				this.field336 = 1;
				if ((this.field345 == 0) || (this.field345 > (var2 - this.field347))) {
					this.field345 = var2 - this.field347;
				}
			} else if (this.field347 > var2) {
				this.field336 = -1;
				if ((this.field345 == 0) || (this.field345 > (this.field347 - var2))) {
					this.field345 = this.field347 - var2;
				}
			} else {
				this.field336 = 0;
			}

			if (this.field340 < var3) {
				this.field348 = 1;
				if ((this.field345 == 0) || (this.field345 > (var3 - this.field340))) {
					this.field345 = var3 - this.field340;
				}
			} else if (this.field340 > var3) {
				this.field348 = -1;
				if ((this.field345 == 0) || (this.field345 > (this.field340 - var3))) {
					this.field345 = this.field340 - var3;
				}
			} else {
				this.field348 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("aq")
	int vmethod968() {
		int var1 = (this.field337 * 3) >> 6;
		var1 = (var1 ^ (var1 >> 31)) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= (var1 * this.field338) / (((RawSound) (super.sound)).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= (var1 * this.start) / ((RawSound) (super.sound)).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("v")
	static int method884(int var0, int var1) {
		return var1 < 0 ? var0 : ((int) ((((double) (var0)) * Math.sqrt(((double) (16384 - var1)) * 1.220703125E-4)) + 0.5));
	}

	@ObfuscatedName("o")
	static int method812(int var0, int var1) {
		return var1 < 0 ? -var0 : ((int) ((((double) (var0)) * Math.sqrt(((double) (var1)) * 1.220703125E-4)) + 0.5));
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Laj;II)Lam;")

	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return (var0.samples != null) && (var0.samples.length != 0) ? new RawPcmStream(var0, ((int) (((((long) (var0.sampleRate)) * 256L) * ((long) (var1))) / ((long) (SecureRandomFuture.field949 * 100)))), var2 << 6) : null;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(Laj;III)Lam;")

	public static RawPcmStream method924(RawSound var0, int var1, int var2, int var3) {
		return (var0.samples != null) && (var0.samples.length != 0) ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = 
	"([B[IIIIIIILam;)I")

	static int method879(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = (var3 + var7) - var2) > var6) {
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

		var8.field338 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = 
	"(I[B[IIIIIIIILam;)I")

	static int method842(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = (var4 + var9) - var3) > var8) {
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

		var10.field338 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = 
	"([B[IIIIIIILam;)I")

	static int method866(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = (var3 + var2) - (var7 - 1)) > var6) {
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

		var8.field338 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = 
	"(I[B[IIIIIIIILam;)I")

	static int method844(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = (var3 + var4) - (var9 - 1)) > var8) {
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

		var10.field338 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = 
	"(II[B[IIIIIIILam;II)I")

	static int method845(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if ((var11 == 0) || ((var7 = var5 + (((var11 + (var9 - var4)) - 257) / var11)) > var8)) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += (((var13 << 8) + ((var2[var1 + 1] - var13) * (var4 & 255))) * var6) >> 6;
			var4 += var11;
		} 

		if ((var11 == 0) || ((var7 = var5 + (((var11 + (var9 - var4)) - 1) / var11)) > var8)) {
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += (((var13 << 8) + ((var1 - var13) * (var4 & 255))) * var6) >> 6;
		}

		var10.field338 = var4;
		return var5;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = 
	"(II[B[IIIIIIIILam;II)I")

	static int method846(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if ((var12 == 0) || ((var8 = var5 + ((((var10 - var4) + var12) - 257) / var12)) > var9)) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + ((var4 & 255) * (var2[var1 + 1] - var14));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
		}

		if ((var12 == 0) || ((var8 = (var5 >> 1) + ((((var10 - var4) + var12) - 1) / var12)) > var9)) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + ((var1 - var14) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
		}

		var11.field338 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = 
	"(II[B[IIIIIIILam;II)I")

	static int method847(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if ((var11 == 0) || ((var7 = var5 + ((var11 + ((var9 + 256) - var4)) / var11)) > var8)) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += (((var13 << 8) + ((var2[var1] - var13) * (var4 & 255))) * var6) >> 6;
			var4 += var11;
		} 

		if ((var11 == 0) || ((var7 = var5 + ((var11 + (var9 - var4)) / var11)) > var8)) {
			var7 = var8;
		}

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += (((var0 << 8) + ((var2[var4 >> 8] - var0) * (var4 & 255))) * var6) >> 6;
		}

		var10.field338 = var4;
		return var5;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = 
	"(II[B[IIIIIIIILam;II)I")

	static int method848(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if ((var12 == 0) || ((var8 = var5 + ((((var10 + 256) - var4) + var12) / var12)) > var9)) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = ((var2[var1] - var14) * (var4 & 255)) + (var14 << 8);
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
		}

		if ((var12 == 0) || ((var8 = (var5 >> 1) + (((var10 - var4) + var12) / var12)) > var9)) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + ((var4 & 255) * (var2[var4 >> 8] - var1));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
		}

		var11.field338 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = 
	"([B[IIIIIIIILam;)I")

	static int method962(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = (var3 + var8) - var2) > var7) {
			var6 = var7;
		}

		var9.field347 += var9.field336 * (var6 - var3);
		var9.field340 += var9.field348 * (var6 - var3);

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
		var9.field338 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(descriptor = 
	"(I[B[IIIIIIIIIILam;)I")

	static int method850(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = (var11 + var4) - var3) > var10) {
			var9 = var10;
		}

		var12.field337 += var12.field346 * (var9 - var4);
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

		var12.field347 = var5 >> 2;
		var12.field340 = var6 >> 2;
		var12.field338 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = 
	"([B[IIIIIIIILam;)I")

	static int method851(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = (var3 + var2) - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field347 += var9.field336 * (var6 - var3);
		var9.field340 += var9.field348 * (var6 - var3);

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
		var9.field338 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(descriptor = 
	"(I[B[IIIIIIIIIILam;)I")

	static int method954(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = (var3 + var4) - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field337 += var12.field346 * (var9 - var4);
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

		var12.field347 = var5 >> 2;
		var12.field340 = var6 >> 2;
		var12.field338 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(descriptor = 
	"(II[B[IIIIIIIILam;II)I")

	static int method821(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field347 -= var11.field336 * var5;
		var11.field340 -= var11.field348 * var5;
		if ((var12 == 0) || ((var8 = var5 + ((((var10 - var4) + var12) - 257) / var12)) > var9)) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += (((var14 << 8) + ((var2[var1 + 1] - var14) * (var4 & 255))) * var6) >> 6;
			var6 += var7;
			var4 += var12;
		} 

		if ((var12 == 0) || ((var8 = var5 + ((((var10 - var4) + var12) - 1) / var12)) > var9)) {
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += (((var14 << 8) + ((var1 - var14) * (var4 & 255))) * var6) >> 6;
			var6 += var7;
		}

		var11.field347 += var11.field336 * var5;
		var11.field340 += var11.field348 * var5;
		var11.field337 = var6;
		var11.field338 = var4;
		return var5;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(descriptor = 
	"(II[B[IIIIIIIIIILam;II)I")

	static int method854(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field337 -= var5 * var13.field346;
		if ((var14 == 0) || ((var10 = var5 + ((((var12 - var4) + var14) - 257) / var14)) > var11)) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + ((var4 & 255) * (var2[var1 + 1] - var16));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
			var7 += var9;
		}

		if ((var14 == 0) || ((var10 = (var5 >> 1) + ((((var12 - var4) + var14) - 1) / var14)) > var11)) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + ((var1 - var16) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field337 += var13.field346 * var5;
		var13.field347 = var6;
		var13.field340 = var7;
		var13.field338 = var4;
		return var5;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(descriptor = 
	"(II[B[IIIIIIIILam;II)I")

	static int method912(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field347 -= var11.field336 * var5;
		var11.field340 -= var11.field348 * var5;
		if ((var12 == 0) || ((var8 = var5 + ((((var10 + 256) - var4) + var12) / var12)) > var9)) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += (((var14 << 8) + ((var2[var1] - var14) * (var4 & 255))) * var6) >> 6;
			var6 += var7;
			var4 += var12;
		} 

		if ((var12 == 0) || ((var8 = var5 + (((var10 - var4) + var12) / var12)) > var9)) {
			var8 = var9;
		}

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += (((var0 << 8) + ((var2[var4 >> 8] - var0) * (var4 & 255))) * var6) >> 6;
			var6 += var7;
		}

		var11.field347 += var11.field336 * var5;
		var11.field340 += var11.field348 * var5;
		var11.field337 = var6;
		var11.field338 = var4;
		return var5;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(descriptor = 
	"(II[B[IIIIIIIIIILam;II)I")

	static int method856(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field337 -= var5 * var13.field346;
		if ((var14 == 0) || ((var10 = var5 + ((((var12 + 256) - var4) + var14) / var14)) > var11)) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = ((var2[var1] - var16) * (var4 & 255)) + (var16 << 8);
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
			var7 += var9;
		}

		if ((var14 == 0) || ((var10 = (var5 >> 1) + (((var12 - var4) + var14) / var14)) > var11)) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + ((var4 & 255) * (var2[var4 >> 8] - var1));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field337 += var13.field346 * var5;
		var13.field347 = var6;
		var13.field340 = var7;
		var13.field338 = var4;
		return var5;
	}
}