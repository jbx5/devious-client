import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("am")
	int field347;
	@ObfuscatedName("ap")
	int field339;
	@ObfuscatedName("af")
	int field348;
	@ObfuscatedName("aj")
	int field341;
	@ObfuscatedName("aq")
	int field352;
	@ObfuscatedName("ar")
	int field340;
	@ObfuscatedName("ag")
	int field344;
	@ObfuscatedName("ao")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("ae")
	@Export("start")
	int start;
	@ObfuscatedName("aa")
	@Export("end")
	int end;
	@ObfuscatedName("au")
	boolean field343;
	@ObfuscatedName("an")
	int field342;
	@ObfuscatedName("ad")
	int field350;
	@ObfuscatedName("ax")
	int field351;
	@ObfuscatedName("aw")
	int field338;

	@ObfuscatedSignature(
		descriptor = "(Lbm;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field343 = var1.field267;
		this.field339 = var2;
		this.field348 = var3;
		this.field341 = var4;
		this.field347 = 0;
		this.method1027();
	}

	@ObfuscatedSignature(
		descriptor = "(Lbm;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field343 = var1.field267;
		this.field339 = var2;
		this.field348 = var3;
		this.field341 = 8192;
		this.field347 = 0;
		this.method1027();
	}

	@ObfuscatedName("aq")
	void method1027() {
		this.field352 = this.field348;
		this.field340 = method979(this.field348, this.field341);
		this.field344 = method915(this.field348, this.field341);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Lbl;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lbl;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("ao")
	protected int vmethod6281() {
		return this.field348 == 0 && this.field342 == 0 ? 0 : 1;
	}

	@ObfuscatedName("ae")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field348 == 0 && this.field342 == 0) {
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
				if (this.field339 <= 0) {
					this.method929();
					this.remove();
					return;
				}

				this.field347 = 0;
			}

			if (this.field347 >= var7) {
				if (this.field339 >= 0) {
					this.method929();
					this.remove();
					return;
				}

				this.field347 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field343) {
					if (this.field339 < 0) {
						var9 = this.method1031(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field347 >= var5) {
							return;
						}

						this.field347 = var5 + var5 - 1 - this.field347;
						this.field339 = -this.field339;
					}

					while (true) {
						var9 = this.method942(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field347 < var6) {
							return;
						}

						this.field347 = var6 + var6 - 1 - this.field347;
						this.field339 = -this.field339;
						var9 = this.method1031(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field347 >= var5) {
							return;
						}

						this.field347 = var5 + var5 - 1 - this.field347;
						this.field339 = -this.field339;
					}
				} else if (this.field339 < 0) {
					while (true) {
						var9 = this.method1031(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field347 >= var5) {
							return;
						}

						this.field347 = var6 - 1 - (var6 - 1 - this.field347) % var8;
					}
				} else {
					while (true) {
						var9 = this.method942(var1, var9, var6, var3, var4.samples[this.start]);
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
							if (this.field339 < 0) {
								var9 = this.method1031(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field347 >= var5) {
									return;
								}

								this.field347 = var5 + var5 - 1 - this.field347;
								this.field339 = -this.field339;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method942(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field347 < var6) {
									return;
								}

								this.field347 = var6 + var6 - 1 - this.field347;
								this.field339 = -this.field339;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method1031(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field347 >= var5) {
									return;
								}

								this.field347 = var5 + var5 - 1 - this.field347;
								this.field339 = -this.field339;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field339 < 0) {
							while (true) {
								var9 = this.method1031(var1, var9, var5, var3, var4.samples[this.end - 1]);
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
								var9 = this.method942(var1, var9, var6, var3, var4.samples[this.start]);
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

				if (this.field339 < 0) {
					this.method1031(var1, var9, 0, var3, 0);
					if (this.field347 < 0) {
						this.field347 = -1;
						this.method929();
						this.remove();
					}
				} else {
					this.method942(var1, var9, var7, var3, 0);
					if (this.field347 >= var7) {
						this.field347 = var7;
						this.method929();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("aa")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("au")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field342 > 0) {
			if (var1 >= this.field342) {
				if (this.field348 == Integer.MIN_VALUE) {
					this.field348 = 0;
					this.field344 = 0;
					this.field340 = 0;
					this.field352 = 0;
					this.remove();
					var1 = this.field342;
				}

				this.field342 = 0;
				this.method1027();
			} else {
				this.field352 += this.field350 * var1;
				this.field340 += this.field351 * var1;
				this.field344 += this.field338 * var1;
				this.field342 -= var1;
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
			if (this.field339 <= 0) {
				this.method929();
				this.remove();
				return;
			}

			this.field347 = 0;
		}

		if (this.field347 >= var5) {
			if (this.field339 >= 0) {
				this.method929();
				this.remove();
				return;
			}

			this.field347 = var5 - 1;
		}

		this.field347 += this.field339 * var1;
		if (this.numLoops < 0) {
			if (!this.field343) {
				if (this.field339 < 0) {
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
				if (this.field339 < 0) {
					if (this.field347 >= var3) {
						return;
					}

					this.field347 = var3 + var3 - 1 - this.field347;
					this.field339 = -this.field339;
				}

				while (this.field347 >= var4) {
					this.field347 = var4 + var4 - 1 - this.field347;
					this.field339 = -this.field339;
					if (this.field347 >= var3) {
						return;
					}

					this.field347 = var3 + var3 - 1 - this.field347;
					this.field339 = -this.field339;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field343) {
					label129: {
						if (this.field339 < 0) {
							if (this.field347 >= var3) {
								return;
							}

							this.field347 = var3 + var3 - 1 - this.field347;
							this.field339 = -this.field339;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field347 < var4) {
								return;
							}

							this.field347 = var4 + var4 - 1 - this.field347;
							this.field339 = -this.field339;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field347 >= var3) {
								return;
							}

							this.field347 = var3 + var3 - 1 - this.field347;
							this.field339 = -this.field339;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field339 < 0) {
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

			if (this.field339 < 0) {
				if (this.field347 < 0) {
					this.field347 = -1;
					this.method929();
					this.remove();
				}
			} else if (this.field347 >= var5) {
				this.field347 = var5;
				this.method929();
				this.remove();
			}

		}
	}

	@ObfuscatedName("an")
	public synchronized void method958(int var1) {
		this.method952(var1 << 6, this.method926());
	}

	@ObfuscatedName("ad")
	synchronized void method1036(int var1) {
		this.method952(var1, this.method926());
	}

	@ObfuscatedName("ax")
	synchronized void method952(int var1, int var2) {
		this.field348 = var1;
		this.field341 = var2;
		this.field342 = 0;
		this.method1027();
	}

	@ObfuscatedName("aw")
	public synchronized int method925() {
		return this.field348 == Integer.MIN_VALUE ? 0 : this.field348;
	}

	@ObfuscatedName("az")
	public synchronized int method926() {
		return this.field341 < 0 ? -1 : this.field341;
	}

	@ObfuscatedName("av")
	public synchronized void method959(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field347 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method923() {
		this.field339 = (this.field339 ^ this.field339 >> 31) + (this.field339 >>> 31);
		this.field339 = -this.field339;
	}

	@ObfuscatedName("ay")
	void method929() {
		if (this.field342 != 0) {
			if (this.field348 == Integer.MIN_VALUE) {
				this.field348 = 0;
			}

			this.field342 = 0;
			this.method1027();
		}

	}

	@ObfuscatedName("as")
	public synchronized void method930(int var1, int var2) {
		this.method931(var1, var2, this.method926());
	}

	@ObfuscatedName("ab")
	public synchronized void method931(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method952(var2, var3);
		} else {
			int var4 = method979(var2, var3);
			int var5 = method915(var2, var3);
			if (var4 == this.field340 && var5 == this.field344) {
				this.field342 = 0;
			} else {
				int var6 = var2 - this.field352;
				if (this.field352 - var2 > var6) {
					var6 = this.field352 - var2;
				}

				if (var4 - this.field340 > var6) {
					var6 = var4 - this.field340;
				}

				if (this.field340 - var4 > var6) {
					var6 = this.field340 - var4;
				}

				if (var5 - this.field344 > var6) {
					var6 = var5 - this.field344;
				}

				if (this.field344 - var5 > var6) {
					var6 = this.field344 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field342 = var1;
				this.field348 = var2;
				this.field341 = var3;
				this.field350 = (var2 - this.field352) / var1;
				this.field351 = (var4 - this.field340) / var1;
				this.field338 = (var5 - this.field344) / var1;
			}
		}
	}

	@ObfuscatedName("ah")
	public synchronized void method1022(int var1) {
		if (var1 == 0) {
			this.method1036(0);
			this.remove();
		} else if (this.field340 == 0 && this.field344 == 0) {
			this.field342 = 0;
			this.field348 = 0;
			this.field352 = 0;
			this.remove();
		} else {
			int var2 = -this.field352;
			if (this.field352 > var2) {
				var2 = this.field352;
			}

			if (-this.field340 > var2) {
				var2 = -this.field340;
			}

			if (this.field340 > var2) {
				var2 = this.field340;
			}

			if (-this.field344 > var2) {
				var2 = -this.field344;
			}

			if (this.field344 > var2) {
				var2 = this.field344;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field342 = var1;
			this.field348 = Integer.MIN_VALUE;
			this.field350 = -this.field352 / var1;
			this.field351 = -this.field340 / var1;
			this.field338 = -this.field344 / var1;
		}
	}

	@ObfuscatedName("bg")
	public synchronized void method933(int var1) {
		if (this.field339 < 0) {
			this.field339 = -var1;
		} else {
			this.field339 = var1;
		}

	}

	@ObfuscatedName("bt")
	public synchronized int method934() {
		return this.field339 < 0 ? -this.field339 : this.field339;
	}

	@ObfuscatedName("br")
	public boolean method988() {
		return this.field347 < 0 || this.field347 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("ba")
	public boolean method936() {
		return this.field342 != 0;
	}

	@ObfuscatedName("bc")
	int method942(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field342 > 0) {
				int var6 = var2 + this.field342;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field342 += var2;
				if (this.field339 == 256 && (this.field347 & 255) == 0) {
					if (class462.PcmPlayer_stereo) {
						var2 = method982(0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field340, this.field344, this.field351, this.field338, 0, var6, var3, this);
					} else {
						var2 = method953(((RawSound)super.sound).samples, var1, this.field347, var2, this.field352, this.field350, 0, var6, var3, this);
					}
				} else if (class462.PcmPlayer_stereo) {
					var2 = method962(0, 0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field340, this.field344, this.field351, this.field338, 0, var6, var3, this, this.field339, var5);
				} else {
					var2 = method957(0, 0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field352, this.field350, 0, var6, var3, this, this.field339, var5);
				}

				this.field342 -= var2;
				if (this.field342 != 0) {
					return var2;
				}

				if (!this.method944()) {
					continue;
				}

				return var4;
			}

			if (this.field339 == 256 && (this.field347 & 255) == 0) {
				if (class462.PcmPlayer_stereo) {
					return method946(0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field340, this.field344, 0, var4, var3, this);
				}

				return method945(((RawSound)super.sound).samples, var1, this.field347, var2, this.field352, 0, var4, var3, this);
			}

			if (class462.PcmPlayer_stereo) {
				return method950(0, 0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field340, this.field344, 0, var4, var3, this, this.field339, var5);
			}

			return method949(0, 0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field352, 0, var4, var3, this, this.field339, var5);
		}
	}

	@ObfuscatedName("bx")
	int vmethod1061() {
		int var1 = this.field352 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field347 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("bf")
	int method1031(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field342 > 0) {
				int var6 = var2 + this.field342;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field342 += var2;
				if (this.field339 == -256 && (this.field347 & 255) == 0) {
					if (class462.PcmPlayer_stereo) {
						var2 = method1010(0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field340, this.field344, this.field351, this.field338, 0, var6, var3, this);
					} else {
						var2 = method927(((RawSound)super.sound).samples, var1, this.field347, var2, this.field352, this.field350, 0, var6, var3, this);
					}
				} else if (class462.PcmPlayer_stereo) {
					var2 = method938(0, 0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field340, this.field344, this.field351, this.field338, 0, var6, var3, this, this.field339, var5);
				} else {
					var2 = method917(0, 0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field352, this.field350, 0, var6, var3, this, this.field339, var5);
				}

				this.field342 -= var2;
				if (this.field342 != 0) {
					return var2;
				}

				if (!this.method944()) {
					continue;
				}

				return var4;
			}

			if (this.field339 == -256 && (this.field347 & 255) == 0) {
				if (class462.PcmPlayer_stereo) {
					return method948(0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field340, this.field344, 0, var4, var3, this);
				}

				return method947(((RawSound)super.sound).samples, var1, this.field347, var2, this.field352, 0, var4, var3, this);
			}

			if (class462.PcmPlayer_stereo) {
				return method960(0, 0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field340, this.field344, 0, var4, var3, this, this.field339, var5);
			}

			return method1005(0, 0, ((RawSound)super.sound).samples, var1, this.field347, var2, this.field352, 0, var4, var3, this, this.field339, var5);
		}
	}

	@ObfuscatedName("bp")
	boolean method944() {
		int var1 = this.field348;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method979(var1, this.field341);
			var3 = method915(var1, this.field341);
		}

		if (var1 == this.field352 && var2 == this.field340 && var3 == this.field344) {
			if (this.field348 == Integer.MIN_VALUE) {
				this.field348 = 0;
				this.field344 = 0;
				this.field340 = 0;
				this.field352 = 0;
				this.remove();
				return true;
			} else {
				this.method1027();
				return false;
			}
		} else {
			if (this.field352 < var1) {
				this.field350 = 1;
				this.field342 = var1 - this.field352;
			} else if (this.field352 > var1) {
				this.field350 = -1;
				this.field342 = this.field352 - var1;
			} else {
				this.field350 = 0;
			}

			if (this.field340 < var2) {
				this.field351 = 1;
				if (this.field342 == 0 || this.field342 > var2 - this.field340) {
					this.field342 = var2 - this.field340;
				}
			} else if (this.field340 > var2) {
				this.field351 = -1;
				if (this.field342 == 0 || this.field342 > this.field340 - var2) {
					this.field342 = this.field340 - var2;
				}
			} else {
				this.field351 = 0;
			}

			if (this.field344 < var3) {
				this.field338 = 1;
				if (this.field342 == 0 || this.field342 > var3 - this.field344) {
					this.field342 = var3 - this.field344;
				}
			} else if (this.field344 > var3) {
				this.field338 = -1;
				if (this.field342 == 0 || this.field342 > this.field344 - var3) {
					this.field342 = this.field344 - var3;
				}
			} else {
				this.field338 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("am")
	static int method979(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ap")
	static int method915(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lbm;II)Lbs;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(class189.field1993 * 2205000)), var2 << 6) : null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lbm;III)Lbs;"
	)
	public static RawPcmStream method919(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbs;)I"
	)
	static int method945(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbs;)I"
	)
	static int method946(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbs;)I"
	)
	static int method947(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbs;)I"
	)
	static int method948(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbs;II)I"
	)
	static int method949(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbs;II)I"
	)
	static int method950(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbs;II)I"
	)
	static int method1005(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbs;II)I"
	)
	static int method960(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbs;)I"
	)
	static int method953(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field340 += var9.field351 * (var6 - var3);
		var9.field344 += var9.field338 * (var6 - var3);

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

		var9.field352 = var4 >> 2;
		var9.field347 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbs;)I"
	)
	static int method982(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field352 += var12.field350 * (var9 - var4);
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

		var12.field340 = var5 >> 2;
		var12.field344 = var6 >> 2;
		var12.field347 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbs;)I"
	)
	static int method927(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field340 += var9.field351 * (var6 - var3);
		var9.field344 += var9.field338 * (var6 - var3);

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

		var9.field352 = var4 >> 2;
		var9.field347 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbs;)I"
	)
	static int method1010(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field352 += var12.field350 * (var9 - var4);
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

		var12.field340 = var5 >> 2;
		var12.field344 = var6 >> 2;
		var12.field347 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbs;II)I"
	)
	static int method957(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field340 -= var11.field351 * var5;
		var11.field344 -= var11.field338 * var5;
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

		var11.field340 += var11.field351 * var5;
		var11.field344 += var11.field338 * var5;
		var11.field352 = var6;
		var11.field347 = var4;
		return var5;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbs;II)I"
	)
	static int method962(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field352 -= var5 * var13.field350;
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
		var13.field352 += var13.field350 * var5;
		var13.field340 = var6;
		var13.field344 = var7;
		var13.field347 = var4;
		return var5;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbs;II)I"
	)
	static int method917(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field340 -= var11.field351 * var5;
		var11.field344 -= var11.field338 * var5;
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

		var11.field340 += var11.field351 * var5;
		var11.field344 += var11.field338 * var5;
		var11.field352 = var6;
		var11.field347 = var4;
		return var5;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbs;II)I"
	)
	static int method938(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field352 -= var5 * var13.field350;
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
		var13.field352 += var13.field350 * var5;
		var13.field340 = var6;
		var13.field344 = var7;
		var13.field347 = var4;
		return var5;
	}
}
