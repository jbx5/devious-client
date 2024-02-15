import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("aq")
	int field347;
	@ObfuscatedName("aw")
	int field334;
	@ObfuscatedName("al")
	int field335;
	@ObfuscatedName("ai")
	int field336;
	@ObfuscatedName("ar")
	int field333;
	@ObfuscatedName("as")
	int field337;
	@ObfuscatedName("aa")
	int field339;
	@ObfuscatedName("az")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("ao")
	@Export("start")
	int start;
	@ObfuscatedName("au")
	@Export("end")
	int end;
	@ObfuscatedName("ak")
	boolean field343;
	@ObfuscatedName("ah")
	int field344;
	@ObfuscatedName("aj")
	int field345;
	@ObfuscatedName("af")
	int field338;
	@ObfuscatedName("ax")
	int field341;

	@ObfuscatedSignature(
		descriptor = "(Lbr;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field343 = var1.field266;
		this.field334 = var2;
		this.field335 = var3;
		this.field336 = var4;
		this.field347 = 0;
		this.method847();
	}

	@ObfuscatedSignature(
		descriptor = "(Lbr;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field343 = var1.field266;
		this.field334 = var2;
		this.field335 = var3;
		this.field336 = 8192;
		this.field347 = 0;
		this.method847();
	}

	@ObfuscatedName("ar")
	void method847() {
		this.field333 = this.field335;
		this.field337 = method990(this.field335, this.field336);
		this.field339 = method1011(this.field335, this.field336);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lbj;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("az")
	protected int vmethod6346() {
		return this.field335 == 0 && this.field344 == 0 ? 0 : 1;
	}

	@ObfuscatedName("ao")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field335 == 0 && this.field344 == 0) {
			this.skip(var3);
		} else {
			RawSound var4 = (RawSound)super.sound;
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
					this.method856();
					this.remove();
					return;
				}

				this.field347 = 0;
			}

			if (this.field347 >= var7) {
				if (this.field334 >= 0) {
					this.method856();
					this.remove();
					return;
				}

				this.field347 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field343) {
					if (this.field334 < 0) {
						var9 = this.method870(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field347 >= var5) {
							return;
						}

						this.field347 = var5 + var5 - 1 - this.field347;
						this.field334 = -this.field334;
					}

					while (true) {
						var9 = this.method869(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field347 < var6) {
							return;
						}

						this.field347 = var6 + var6 - 1 - this.field347;
						this.field334 = -this.field334;
						var9 = this.method870(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field347 >= var5) {
							return;
						}

						this.field347 = var5 + var5 - 1 - this.field347;
						this.field334 = -this.field334;
					}
				} else if (this.field334 < 0) {
					while (true) {
						var9 = this.method870(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field347 >= var5) {
							return;
						}

						this.field347 = var6 - 1 - (var6 - 1 - this.field347) % var8;
					}
				} else {
					while (true) {
						var9 = this.method869(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field347 < var6) {
							return;
						}

						this.field347 = var5 + (this.field347 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field343) {
						label127: {
							if (this.field334 < 0) {
								var9 = this.method870(var1, var2, var5, var3, var4.samples[this.start]);
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
								var9 = this.method869(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field347 < var6) {
									return;
								}

								this.field347 = var6 + var6 - 1 - this.field347;
								this.field334 = -this.field334;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method870(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field347 >= var5) {
									return;
								}

								this.field347 = var5 + var5 - 1 - this.field347;
								this.field334 = -this.field334;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field334 < 0) {
							while (true) {
								var9 = this.method870(var1, var9, var5, var3, var4.samples[this.end - 1]);
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
								var9 = this.method869(var1, var9, var6, var3, var4.samples[this.start]);
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
					this.method870(var1, var9, 0, var3, 0);
					if (this.field347 < 0) {
						this.field347 = -1;
						this.method856();
						this.remove();
					}
				} else {
					this.method869(var1, var9, var7, var3, 0);
					if (this.field347 >= var7) {
						this.field347 = var7;
						this.method856();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("au")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("ak")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field344 > 0) {
			if (var1 >= this.field344) {
				if (this.field335 == Integer.MIN_VALUE) {
					this.field335 = 0;
					this.field339 = 0;
					this.field337 = 0;
					this.field333 = 0;
					this.remove();
					var1 = this.field344;
				}

				this.field344 = 0;
				this.method847();
			} else {
				this.field333 += this.field345 * var1;
				this.field337 += this.field338 * var1;
				this.field339 += this.field341 * var1;
				this.field344 -= var1;
			}
		}

		RawSound var2 = (RawSound)super.sound;
		int var3 = this.start << 8;
		int var4 = this.end << 8;
		int var5 = var2.samples.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.numLoops = 0;
		}

		if (this.field347 < 0) {
			if (this.field334 <= 0) {
				this.method856();
				this.remove();
				return;
			}

			this.field347 = 0;
		}

		if (this.field347 >= var5) {
			if (this.field334 >= 0) {
				this.method856();
				this.remove();
				return;
			}

			this.field347 = var5 - 1;
		}

		this.field347 += this.field334 * var1;
		if (this.numLoops < 0) {
			if (!this.field343) {
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
				if (this.field343) {
					label129: {
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
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
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
					this.method856();
					this.remove();
				}
			} else if (this.field347 >= var5) {
				this.field347 = var5;
				this.method856();
				this.remove();
			}

		}
	}

	@ObfuscatedName("ah")
	public synchronized void method919(int var1) {
		this.method859(var1 << 6, this.method1009());
	}

	@ObfuscatedName("aj")
	synchronized void method850(int var1) {
		this.method859(var1, this.method1009());
	}

	@ObfuscatedName("af")
	synchronized void method859(int var1, int var2) {
		this.field335 = var1;
		this.field336 = var2;
		this.field344 = 0;
		this.method847();
	}

	@ObfuscatedName("ax")
	public synchronized int method852() {
		return this.field335 == Integer.MIN_VALUE ? 0 : this.field335;
	}

	@ObfuscatedName("an")
	public synchronized int method1009() {
		return this.field336 < 0 ? -1 : this.field336;
	}

	@ObfuscatedName("ag")
	public synchronized void method889(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field347 = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method855() {
		this.field334 = (this.field334 ^ this.field334 >> 31) + (this.field334 >>> 31);
		this.field334 = -this.field334;
	}

	@ObfuscatedName("ad")
	void method856() {
		if (this.field344 != 0) {
			if (this.field335 == Integer.MIN_VALUE) {
				this.field335 = 0;
			}

			this.field344 = 0;
			this.method847();
		}

	}

	@ObfuscatedName("at")
	public synchronized void method857(int var1, int var2) {
		this.method858(var1, var2, this.method1009());
	}

	@ObfuscatedName("ay")
	public synchronized void method858(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method859(var2, var3);
		} else {
			int var4 = method990(var2, var3);
			int var5 = method1011(var2, var3);
			if (var4 == this.field337 && var5 == this.field339) {
				this.field344 = 0;
			} else {
				int var6 = var2 - this.field333;
				if (this.field333 - var2 > var6) {
					var6 = this.field333 - var2;
				}

				if (var4 - this.field337 > var6) {
					var6 = var4 - this.field337;
				}

				if (this.field337 - var4 > var6) {
					var6 = this.field337 - var4;
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
				this.field335 = var2;
				this.field336 = var3;
				this.field345 = (var2 - this.field333) / var1;
				this.field338 = (var4 - this.field337) / var1;
				this.field341 = (var5 - this.field339) / var1;
			}
		}
	}

	@ObfuscatedName("ae")
	public synchronized void method951(int var1) {
		if (var1 == 0) {
			this.method850(0);
			this.remove();
		} else if (this.field337 == 0 && this.field339 == 0) {
			this.field344 = 0;
			this.field335 = 0;
			this.field333 = 0;
			this.remove();
		} else {
			int var2 = -this.field333;
			if (this.field333 > var2) {
				var2 = this.field333;
			}

			if (-this.field337 > var2) {
				var2 = -this.field337;
			}

			if (this.field337 > var2) {
				var2 = this.field337;
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
			this.field335 = Integer.MIN_VALUE;
			this.field345 = -this.field333 / var1;
			this.field338 = -this.field337 / var1;
			this.field341 = -this.field339 / var1;
		}
	}

	@ObfuscatedName("ac")
	public synchronized void method954(int var1) {
		if (this.field334 < 0) {
			this.field334 = -var1;
		} else {
			this.field334 = var1;
		}

	}

	@ObfuscatedName("ab")
	public synchronized int method861() {
		return this.field334 < 0 ? -this.field334 : this.field334;
	}

	@ObfuscatedName("bw")
	public boolean method979() {
		return this.field347 < 0 || this.field347 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("bv")
	public boolean method849() {
		return this.field344 != 0;
	}

	@ObfuscatedName("by")
	int method869(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field344 > 0) {
				int var6 = var2 + this.field344;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field344 += var2;
				if (this.field334 == 256 && (this.field347 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method984(0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field337, this.field339, this.field338, this.field341, 0, var6, var3, this);
					} else {
						var2 = method880(((RawSound)super.sound).samples, var1, this.field347, var2, this.field333, this.field345, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method912(0, 0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field337, this.field339, this.field338, this.field341, 0, var6, var3, this, this.field334, var5);
				} else {
					var2 = method920(0, 0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field333, this.field345, 0, var6, var3, this, this.field334, var5);
				}

				this.field344 -= var2;
				if (this.field344 != 0) {
					return var2;
				}

				if (!this.method871()) {
					continue;
				}

				return var4;
			}

			if (this.field334 == 256 && (this.field347 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method873(0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field337, this.field339, 0, var4, var3, this);
				}

				return method872(((RawSound)super.sound).samples, var1, this.field347, var2, this.field333, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method936(0, 0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field337, this.field339, 0, var4, var3, this, this.field334, var5);
			}

			return method876(0, 0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field333, 0, var4, var3, this, this.field334, var5);
		}
	}

	@ObfuscatedName("bb")
	int method870(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field344 > 0) {
				int var6 = var2 + this.field344;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field344 += var2;
				if (this.field334 == -256 && (this.field347 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method888(0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field337, this.field339, this.field338, this.field341, 0, var6, var3, this);
					} else {
						var2 = method882(((RawSound)super.sound).samples, var1, this.field347, var2, this.field333, this.field345, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method877(0, 0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field337, this.field339, this.field338, this.field341, 0, var6, var3, this, this.field334, var5);
				} else {
					var2 = method886(0, 0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field333, this.field345, 0, var6, var3, this, this.field334, var5);
				}

				this.field344 -= var2;
				if (this.field344 != 0) {
					return var2;
				}

				if (!this.method871()) {
					continue;
				}

				return var4;
			}

			if (this.field334 == -256 && (this.field347 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method875(0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field337, this.field339, 0, var4, var3, this);
				}

				return method874(((RawSound)super.sound).samples, var1, this.field347, var2, this.field333, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method879(0, 0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field337, this.field339, 0, var4, var3, this, this.field334, var5);
			}

			return method878(0, 0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field333, 0, var4, var3, this, this.field334, var5);
		}
	}

	@ObfuscatedName("bf")
	boolean method871() {
		int var1 = this.field335;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method990(var1, this.field336);
			var3 = method1011(var1, this.field336);
		}

		if (var1 == this.field333 && var2 == this.field337 && var3 == this.field339) {
			if (this.field335 == Integer.MIN_VALUE) {
				this.field335 = 0;
				this.field339 = 0;
				this.field337 = 0;
				this.field333 = 0;
				this.remove();
				return true;
			} else {
				this.method847();
				return false;
			}
		} else {
			if (this.field333 < var1) {
				this.field345 = 1;
				this.field344 = var1 - this.field333;
			} else if (this.field333 > var1) {
				this.field345 = -1;
				this.field344 = this.field333 - var1;
			} else {
				this.field345 = 0;
			}

			if (this.field337 < var2) {
				this.field338 = 1;
				if (this.field344 == 0 || this.field344 > var2 - this.field337) {
					this.field344 = var2 - this.field337;
				}
			} else if (this.field337 > var2) {
				this.field338 = -1;
				if (this.field344 == 0 || this.field344 > this.field337 - var2) {
					this.field344 = this.field337 - var2;
				}
			} else {
				this.field338 = 0;
			}

			if (this.field339 < var3) {
				this.field341 = 1;
				if (this.field344 == 0 || this.field344 > var3 - this.field339) {
					this.field344 = var3 - this.field339;
				}
			} else if (this.field339 > var3) {
				this.field341 = -1;
				if (this.field344 == 0 || this.field344 > this.field339 - var3) {
					this.field344 = this.field339 - var3;
				}
			} else {
				this.field341 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("bh")
	int vmethod1014() {
		int var1 = this.field333 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field347 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("aq")
	static int method990(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("aw")
	static int method1011(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lbr;II)Lbs;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field295 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lbr;III)Lbs;"
	)
	public static RawPcmStream method846(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbs;)I"
	)
	static int method872(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbs;)I"
	)
	static int method873(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbs;)I"
	)
	static int method874(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbs;)I"
	)
	static int method875(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbs;II)I"
	)
	static int method876(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbs;II)I"
	)
	static int method936(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbs;II)I"
	)
	static int method878(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbs;II)I"
	)
	static int method879(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbs;)I"
	)
	static int method880(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field337 += var9.field338 * (var6 - var3);
		var9.field339 += var9.field341 * (var6 - var3);

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

		var9.field333 = var4 >> 2;
		var9.field347 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbs;)I"
	)
	static int method984(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field333 += var12.field345 * (var9 - var4);
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

		var12.field337 = var5 >> 2;
		var12.field339 = var6 >> 2;
		var12.field347 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbs;)I"
	)
	static int method882(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field337 += var9.field338 * (var6 - var3);
		var9.field339 += var9.field341 * (var6 - var3);

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

		var9.field333 = var4 >> 2;
		var9.field347 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbs;)I"
	)
	static int method888(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field333 += var12.field345 * (var9 - var4);
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

		var12.field337 = var5 >> 2;
		var12.field339 = var6 >> 2;
		var12.field347 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbs;II)I"
	)
	static int method920(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field337 -= var11.field338 * var5;
		var11.field339 -= var11.field341 * var5;
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

		var11.field337 += var11.field338 * var5;
		var11.field339 += var11.field341 * var5;
		var11.field333 = var6;
		var11.field347 = var4;
		return var5;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbs;II)I"
	)
	static int method912(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field333 -= var5 * var13.field345;
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
		var13.field333 += var13.field345 * var5;
		var13.field337 = var6;
		var13.field339 = var7;
		var13.field347 = var4;
		return var5;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbs;II)I"
	)
	static int method886(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field337 -= var11.field338 * var5;
		var11.field339 -= var11.field341 * var5;
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

		var11.field337 += var11.field338 * var5;
		var11.field339 += var11.field341 * var5;
		var11.field333 = var6;
		var11.field347 = var4;
		return var5;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbs;II)I"
	)
	static int method877(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field333 -= var5 * var13.field345;
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
		var13.field333 += var13.field345 * var5;
		var13.field337 = var6;
		var13.field339 = var7;
		var13.field347 = var4;
		return var5;
	}
}
