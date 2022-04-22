import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("v")
	int field329;
	@ObfuscatedName("c")
	int field328;
	@ObfuscatedName("i")
	int field335;
	@ObfuscatedName("f")
	int field330;
	@ObfuscatedName("b")
	int field331;
	@ObfuscatedName("n")
	int field336;
	@ObfuscatedName("s")
	int field333;
	@ObfuscatedName("l")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("q")
	@Export("start")
	int start;
	@ObfuscatedName("o")
	@Export("end")
	int end;
	@ObfuscatedName("r")
	boolean field337;
	@ObfuscatedName("p")
	int field338;
	@ObfuscatedName("k")
	int field339;
	@ObfuscatedName("d")
	int field340;
	@ObfuscatedName("m")
	int field327;

	@ObfuscatedSignature(descriptor = 
	"(Lat;III)V")

	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field337 = var1.field254;
		this.field328 = var2;
		this.field335 = var3;
		this.field330 = var4;
		this.field329 = 0;
		this.method816();
	}

	@ObfuscatedSignature(descriptor = 
	"(Lat;II)V")

	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field337 = var1.field254;
		this.field328 = var2;
		this.field335 = var3;
		this.field330 = 8192;
		this.field329 = 0;
		this.method816();
	}

	@ObfuscatedName("b")
	void method816() {
		this.field331 = this.field335;
		this.field336 = method955(this.field335, this.field330);
		this.field333 = method832(this.field335, this.field330);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"()Laf;")

	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"()Laf;")

	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("l")
	protected int vmethod5441() {
		return (this.field335 == 0) && (this.field338 == 0) ? 0 : 1;
	}

	@ObfuscatedName("q")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if ((this.field335 == 0) && (this.field338 == 0)) {
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
			if (this.field329 < 0) {
				if (this.field328 <= 0) {
					this.method801();
					this.remove();
					return;
				}

				this.field329 = 0;
			}

			if (this.field329 >= var7) {
				if (this.field328 >= 0) {
					this.method801();
					this.remove();
					return;
				}

				this.field329 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field337) {
					if (this.field328 < 0) {
						var9 = this.method947(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field329 >= var5) {
							return;
						}

						this.field329 = ((var5 + var5) - 1) - this.field329;
						this.field328 = -this.field328;
					}

					while (true) {
						var9 = this.method814(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field329 < var6) {
							return;
						}

						this.field329 = ((var6 + var6) - 1) - this.field329;
						this.field328 = -this.field328;
						var9 = this.method947(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field329 >= var5) {
							return;
						}

						this.field329 = ((var5 + var5) - 1) - this.field329;
						this.field328 = -this.field328;
					} 
				} else if (this.field328 < 0) {
					while (true) {
						var9 = this.method947(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field329 >= var5) {
							return;
						}

						this.field329 = (var6 - 1) - (((var6 - 1) - this.field329) % var8);
					} 
				} else {
					while (true) {
						var9 = this.method814(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field329 < var6) {
							return;
						}

						this.field329 = var5 + ((this.field329 - var5) % var8);
					} 
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field337) {
						label127 : {
							if (this.field328 < 0) {
								var9 = this.method947(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field329 >= var5) {
									return;
								}

								this.field329 = ((var5 + var5) - 1) - this.field329;
								this.field328 = -this.field328;
								if ((--this.numLoops) == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method814(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field329 < var6) {
									return;
								}

								this.field329 = ((var6 + var6) - 1) - this.field329;
								this.field328 = -this.field328;
								if ((--this.numLoops) == 0) {
									break;
								}

								var9 = this.method947(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field329 >= var5) {
									return;
								}

								this.field329 = ((var5 + var5) - 1) - this.field329;
								this.field328 = -this.field328;
							} while ((--this.numLoops) != 0 );
						}
					} else {
						int var10;
						if (this.field328 < 0) {
							while (true) {
								var9 = this.method947(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field329 >= var5) {
									return;
								}

								var10 = ((var6 - 1) - this.field329) / var8;
								if (var10 >= this.numLoops) {
									this.field329 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field329 += var8 * var10;
								this.numLoops -= var10;
							} 
						} else {
							while (true) {
								var9 = this.method814(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field329 < var6) {
									return;
								}

								var10 = (this.field329 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field329 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field329 -= var8 * var10;
								this.numLoops -= var10;
							} 
						}
					}
				}

				if (this.field328 < 0) {
					this.method947(var1, var9, 0, var3, 0);
					if (this.field329 < 0) {
						this.field329 = -1;
						this.method801();
						this.remove();
					}
				} else {
					this.method814(var1, var9, var7, var3, 0);
					if (this.field329 >= var7) {
						this.field329 = var7;
						this.method801();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("o")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("r")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field338 > 0) {
			if (var1 >= this.field338) {
				if (this.field335 == Integer.MIN_VALUE) {
					this.field335 = 0;
					this.field333 = 0;
					this.field336 = 0;
					this.field331 = 0;
					this.remove();
					var1 = this.field338;
				}

				this.field338 = 0;
				this.method816();
			} else {
				this.field331 += this.field339 * var1;
				this.field336 += this.field340 * var1;
				this.field333 += this.field327 * var1;
				this.field338 -= var1;
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

		if (this.field329 < 0) {
			if (this.field328 <= 0) {
				this.method801();
				this.remove();
				return;
			}

			this.field329 = 0;
		}

		if (this.field329 >= var5) {
			if (this.field328 >= 0) {
				this.method801();
				this.remove();
				return;
			}

			this.field329 = var5 - 1;
		}

		this.field329 += this.field328 * var1;
		if (this.numLoops < 0) {
			if (!this.field337) {
				if (this.field328 < 0) {
					if (this.field329 >= var3) {
						return;
					}

					this.field329 = (var4 - 1) - (((var4 - 1) - this.field329) % var6);
				} else {
					if (this.field329 < var4) {
						return;
					}

					this.field329 = var3 + ((this.field329 - var3) % var6);
				}

			} else {
				if (this.field328 < 0) {
					if (this.field329 >= var3) {
						return;
					}

					this.field329 = ((var3 + var3) - 1) - this.field329;
					this.field328 = -this.field328;
				}

				while (this.field329 >= var4) {
					this.field329 = ((var4 + var4) - 1) - this.field329;
					this.field328 = -this.field328;
					if (this.field329 >= var3) {
						return;
					}

					this.field329 = ((var3 + var3) - 1) - this.field329;
					this.field328 = -this.field328;
				} 

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field337) {
					label129 : {
						if (this.field328 < 0) {
							if (this.field329 >= var3) {
								return;
							}

							this.field329 = ((var3 + var3) - 1) - this.field329;
							this.field328 = -this.field328;
							if ((--this.numLoops) == 0) {
								break label129;
							}
						}

						do {
							if (this.field329 < var4) {
								return;
							}

							this.field329 = ((var4 + var4) - 1) - this.field329;
							this.field328 = -this.field328;
							if ((--this.numLoops) == 0) {
								break;
							}

							if (this.field329 >= var3) {
								return;
							}

							this.field329 = ((var3 + var3) - 1) - this.field329;
							this.field328 = -this.field328;
						} while ((--this.numLoops) != 0 );
					}
				} else {
					label161 : {
						int var7;
						if (this.field328 < 0) {
							if (this.field329 >= var3) {
								return;
							}

							var7 = ((var4 - 1) - this.field329) / var6;
							if (var7 >= this.numLoops) {
								this.field329 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field329 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field329 < var4) {
								return;
							}

							var7 = (this.field329 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field329 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field329 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field328 < 0) {
				if (this.field329 < 0) {
					this.field329 = -1;
					this.method801();
					this.remove();
				}
			} else if (this.field329 >= var5) {
				this.field329 = var5;
				this.method801();
				this.remove();
			}

		}
	}

	@ObfuscatedName("p")
	public synchronized void method929(int var1) {
		this.method921(var1 << 6, this.method798());
	}

	@ObfuscatedName("w")
	synchronized void method942(int var1) {
		this.method921(var1, this.method798());
	}

	@ObfuscatedName("k")
	synchronized void method921(int var1, int var2) {
		this.field335 = var1;
		this.field330 = var2;
		this.field338 = 0;
		this.method816();
	}

	@ObfuscatedName("d")
	public synchronized int method797() {
		return this.field335 == Integer.MIN_VALUE ? 0 : this.field335;
	}

	@ObfuscatedName("m")
	public synchronized int method798() {
		return this.field330 < 0 ? -1 : this.field330;
	}

	@ObfuscatedName("u")
	public synchronized void method799(int var1) {
		int var2 = ((RawSound) (super.sound)).samples.length << 8;
		if (var1 < (-1)) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field329 = var1;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = 
	"(Z)V", garbageValue = 
	"1")

	public synchronized void method800() {
		this.field328 = (this.field328 ^ (this.field328 >> 31)) + (this.field328 >>> 31);
		this.field328 = -this.field328;
	}

	@ObfuscatedName("g")
	void method801() {
		if (this.field338 != 0) {
			if (this.field335 == Integer.MIN_VALUE) {
				this.field335 = 0;
			}

			this.field338 = 0;
			this.method816();
		}

	}

	@ObfuscatedName("x")
	public synchronized void method802(int var1, int var2) {
		this.method880(var1, var2, this.method798());
	}

	@ObfuscatedName("a")
	public synchronized void method880(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method921(var2, var3);
		} else {
			int var4 = method955(var2, var3);
			int var5 = method832(var2, var3);
			if ((var4 == this.field336) && (var5 == this.field333)) {
				this.field338 = 0;
			} else {
				int var6 = var2 - this.field331;
				if ((this.field331 - var2) > var6) {
					var6 = this.field331 - var2;
				}

				if ((var4 - this.field336) > var6) {
					var6 = var4 - this.field336;
				}

				if ((this.field336 - var4) > var6) {
					var6 = this.field336 - var4;
				}

				if ((var5 - this.field333) > var6) {
					var6 = var5 - this.field333;
				}

				if ((this.field333 - var5) > var6) {
					var6 = this.field333 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field338 = var1;
				this.field335 = var2;
				this.field330 = var3;
				this.field339 = (var2 - this.field331) / var1;
				this.field340 = (var4 - this.field336) / var1;
				this.field327 = (var5 - this.field333) / var1;
			}
		}
	}

	@ObfuscatedName("y")
	public synchronized void method882(int var1) {
		if (var1 == 0) {
			this.method942(0);
			this.remove();
		} else if ((this.field336 == 0) && (this.field333 == 0)) {
			this.field338 = 0;
			this.field335 = 0;
			this.field331 = 0;
			this.remove();
		} else {
			int var2 = -this.field331;
			if (this.field331 > var2) {
				var2 = this.field331;
			}

			if ((-this.field336) > var2) {
				var2 = -this.field336;
			}

			if (this.field336 > var2) {
				var2 = this.field336;
			}

			if ((-this.field333) > var2) {
				var2 = -this.field333;
			}

			if (this.field333 > var2) {
				var2 = this.field333;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field338 = var1;
			this.field335 = Integer.MIN_VALUE;
			this.field339 = (-this.field331) / var1;
			this.field340 = (-this.field336) / var1;
			this.field327 = (-this.field333) / var1;
		}
	}

	@ObfuscatedName("j")
	public synchronized void method896(int var1) {
		if (this.field328 < 0) {
			this.field328 = -var1;
		} else {
			this.field328 = var1;
		}

	}

	@ObfuscatedName("aj")
	public synchronized int method866() {
		return this.field328 < 0 ? -this.field328 : this.field328;
	}

	@ObfuscatedName("al")
	public boolean method830() {
		return (this.field329 < 0) || (this.field329 >= (((RawSound) (super.sound)).samples.length << 8));
	}

	@ObfuscatedName("at")
	public boolean method808() {
		return this.field338 != 0;
	}

	@ObfuscatedName("an")
	int method814(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field338 > 0) {
				int var6 = var2 + this.field338;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field338 += var2;
				if ((this.field328 == 256) && ((this.field329 & 255) == 0)) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method826(0, ((RawSound) (super.sound)).samples, var1, this.field329, var2, this.field336, this.field333, this.field340, this.field327, 0, var6, var3, this);
					} else {
						var2 = method874(((RawSound) (super.sound)).samples, var1, this.field329, var2, this.field331, this.field339, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method951(0, 0, ((RawSound) (super.sound)).samples, var1, this.field329, var2, this.field336, this.field333, this.field340, this.field327, 0, var6, var3, this, this.field328, var5);
				} else {
					var2 = method831(0, 0, ((RawSound) (super.sound)).samples, var1, this.field329, var2, this.field331, this.field339, 0, var6, var3, this, this.field328, var5);
				}

				this.field338 -= var2;
				if (this.field338 != 0) {
					return var2;
				}

				if (!this.method956()) {
					continue;
				}

				return var4;
			}

			if ((this.field328 == 256) && ((this.field329 & 255) == 0)) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method818(0, ((RawSound) (super.sound)).samples, var1, this.field329, var2, this.field336, this.field333, 0, var4, var3, this);
				}

				return method817(((RawSound) (super.sound)).samples, var1, this.field329, var2, this.field331, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method822(0, 0, ((RawSound) (super.sound)).samples, var1, this.field329, var2, this.field336, this.field333, 0, var4, var3, this, this.field328, var5);
			}

			return method889(0, 0, ((RawSound) (super.sound)).samples, var1, this.field329, var2, this.field331, 0, var4, var3, this, this.field328, var5);
		} 
	}

	@ObfuscatedName("ay")
	int method947(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field338 > 0) {
				int var6 = var2 + this.field338;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field338 += var2;
				if ((this.field328 == (-256)) && ((this.field329 & 255) == 0)) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method828(0, ((RawSound) (super.sound)).samples, var1, this.field329, var2, this.field336, this.field333, this.field340, this.field327, 0, var6, var3, this);
					} else {
						var2 = method827(((RawSound) (super.sound)).samples, var1, this.field329, var2, this.field331, this.field339, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method858(0, 0, ((RawSound) (super.sound)).samples, var1, this.field329, var2, this.field336, this.field333, this.field340, this.field327, 0, var6, var3, this, this.field328, var5);
				} else {
					var2 = method919(0, 0, ((RawSound) (super.sound)).samples, var1, this.field329, var2, this.field331, this.field339, 0, var6, var3, this, this.field328, var5);
				}

				this.field338 -= var2;
				if (this.field338 != 0) {
					return var2;
				}

				if (!this.method956()) {
					continue;
				}

				return var4;
			}

			if ((this.field328 == (-256)) && ((this.field329 & 255) == 0)) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method820(0, ((RawSound) (super.sound)).samples, var1, this.field329, var2, this.field336, this.field333, 0, var4, var3, this);
				}

				return method819(((RawSound) (super.sound)).samples, var1, this.field329, var2, this.field331, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method824(0, 0, ((RawSound) (super.sound)).samples, var1, this.field329, var2, this.field336, this.field333, 0, var4, var3, this, this.field328, var5);
			}

			return method823(0, 0, ((RawSound) (super.sound)).samples, var1, this.field329, var2, this.field331, 0, var4, var3, this, this.field328, var5);
		} 
	}

	@ObfuscatedName("ag")
	int vmethod962() {
		int var1 = (this.field331 * 3) >> 6;
		var1 = (var1 ^ (var1 >> 31)) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= (var1 * this.field329) / (((RawSound) (super.sound)).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= (var1 * this.start) / ((RawSound) (super.sound)).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("ah")
	boolean method956() {
		int var1 = this.field335;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method955(var1, this.field330);
			var3 = method832(var1, this.field330);
		}

		if (((var1 == this.field331) && (var2 == this.field336)) && (var3 == this.field333)) {
			if (this.field335 == Integer.MIN_VALUE) {
				this.field335 = 0;
				this.field333 = 0;
				this.field336 = 0;
				this.field331 = 0;
				this.remove();
				return true;
			} else {
				this.method816();
				return false;
			}
		} else {
			if (this.field331 < var1) {
				this.field339 = 1;
				this.field338 = var1 - this.field331;
			} else if (this.field331 > var1) {
				this.field339 = -1;
				this.field338 = this.field331 - var1;
			} else {
				this.field339 = 0;
			}

			if (this.field336 < var2) {
				this.field340 = 1;
				if ((this.field338 == 0) || (this.field338 > (var2 - this.field336))) {
					this.field338 = var2 - this.field336;
				}
			} else if (this.field336 > var2) {
				this.field340 = -1;
				if ((this.field338 == 0) || (this.field338 > (this.field336 - var2))) {
					this.field338 = this.field336 - var2;
				}
			} else {
				this.field340 = 0;
			}

			if (this.field333 < var3) {
				this.field327 = 1;
				if ((this.field338 == 0) || (this.field338 > (var3 - this.field333))) {
					this.field338 = var3 - this.field333;
				}
			} else if (this.field333 > var3) {
				this.field327 = -1;
				if ((this.field338 == 0) || (this.field338 > (this.field333 - var3))) {
					this.field338 = this.field333 - var3;
				}
			} else {
				this.field327 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("v")
	static int method955(int var0, int var1) {
		return var1 < 0 ? var0 : ((int) ((((double) (var0)) * Math.sqrt(((double) (16384 - var1)) * 1.220703125E-4)) + 0.5));
	}

	@ObfuscatedName("c")
	static int method832(int var0, int var1) {
		return var1 < 0 ? -var0 : ((int) ((((double) (var0)) * Math.sqrt(((double) (var1)) * 1.220703125E-4)) + 0.5));
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lat;II)Lau;")

	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return (var0.samples != null) && (var0.samples.length != 0) ? new RawPcmStream(var0, ((int) (((((long) (var0.sampleRate)) * 256L) * ((long) (var1))) / ((long) (PcmPlayer.field268 * 100)))), var2 << 6) : null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Lat;III)Lau;")

	public static RawPcmStream method791(RawSound var0, int var1, int var2, int var3) {
		return (var0.samples != null) && (var0.samples.length != 0) ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = 
	"([B[IIIIIIILau;)I")

	static int method817(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field329 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = 
	"(I[B[IIIIIIIILau;)I")

	static int method818(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field329 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = 
	"([B[IIIIIIILau;)I")

	static int method819(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field329 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = 
	"(I[B[IIIIIIIILau;)I")

	static int method820(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field329 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = 
	"(II[B[IIIIIIILau;II)I")

	static int method889(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field329 = var4;
		return var5;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = 
	"(II[B[IIIIIIIILau;II)I")

	static int method822(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field329 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = 
	"(II[B[IIIIIIILau;II)I")

	static int method823(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field329 = var4;
		return var5;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = 
	"(II[B[IIIIIIIILau;II)I")

	static int method824(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field329 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(descriptor = 
	"([B[IIIIIIIILau;)I")

	static int method874(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = (var3 + var8) - var2) > var7) {
			var6 = var7;
		}

		var9.field336 += var9.field340 * (var6 - var3);
		var9.field333 += var9.field327 * (var6 - var3);

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

		var9.field331 = var4 >> 2;
		var9.field329 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = 
	"(I[B[IIIIIIIIIILau;)I")

	static int method826(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = (var11 + var4) - var3) > var10) {
			var9 = var10;
		}

		var12.field331 += var12.field339 * (var9 - var4);
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
		var12.field333 = var6 >> 2;
		var12.field329 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = 
	"([B[IIIIIIIILau;)I")

	static int method827(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = (var3 + var2) - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field336 += var9.field340 * (var6 - var3);
		var9.field333 += var9.field327 * (var6 - var3);

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

		var9.field331 = var4 >> 2;
		var9.field329 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(descriptor = 
	"(I[B[IIIIIIIIIILau;)I")

	static int method828(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = (var3 + var4) - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field331 += var12.field339 * (var9 - var4);
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
		var12.field333 = var6 >> 2;
		var12.field329 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(descriptor = 
	"(II[B[IIIIIIIILau;II)I")

	static int method831(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field336 -= var11.field340 * var5;
		var11.field333 -= var11.field327 * var5;
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

		var11.field336 += var11.field340 * var5;
		var11.field333 += var11.field327 * var5;
		var11.field331 = var6;
		var11.field329 = var4;
		return var5;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(descriptor = 
	"(II[B[IIIIIIIIIILau;II)I")

	static int method951(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field331 -= var5 * var13.field339;
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
		var13.field331 += var13.field339 * var5;
		var13.field336 = var6;
		var13.field333 = var7;
		var13.field329 = var4;
		return var5;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(descriptor = 
	"(II[B[IIIIIIIILau;II)I")

	static int method919(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field336 -= var11.field340 * var5;
		var11.field333 -= var11.field327 * var5;
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

		var11.field336 += var11.field340 * var5;
		var11.field333 += var11.field327 * var5;
		var11.field331 = var6;
		var11.field329 = var4;
		return var5;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(descriptor = 
	"(II[B[IIIIIIIIIILau;II)I")

	static int method858(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field331 -= var5 * var13.field339;
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
		var13.field331 += var13.field339 * var5;
		var13.field336 = var6;
		var13.field333 = var7;
		var13.field329 = var4;
		return var5;
	}
}