import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
   @ObfuscatedName("f")
   int field357;
   @ObfuscatedName("v")
   int field354;
   @ObfuscatedName("s")
   int field367;
   @ObfuscatedName("z")
   int field356;
   @ObfuscatedName("j")
   int field362;
   @ObfuscatedName("i")
   int field358;
   @ObfuscatedName("n")
   int field355;
   @ObfuscatedName("l")
   @Export("numLoops")
   int numLoops;
   @ObfuscatedName("k")
   @Export("start")
   int start;
   @ObfuscatedName("c")
   @Export("end")
   int end;
   @ObfuscatedName("r")
   boolean field363;
   @ObfuscatedName("b")
   int field364;
   @ObfuscatedName("m")
   int field365;
   @ObfuscatedName("t")
   int field359;
   @ObfuscatedName("h")
   int field353;

   @ObfuscatedSignature(
      descriptor = "(Lav;III)V"
   )
   RawPcmStream(RawSound var1, int var2, int var3, int var4) {
      super.sound = var1;
      this.start = var1.start;
      this.end = var1.end;
      this.field363 = var1.field292;
      this.field354 = var2;
      this.field367 = var3;
      this.field356 = var4;
      this.field357 = 0;
      this.method904();
   }

   @ObfuscatedSignature(
      descriptor = "(Lav;II)V"
   )
   RawPcmStream(RawSound var1, int var2, int var3) {
      super.sound = var1;
      this.start = var1.start;
      this.end = var1.end;
      this.field363 = var1.field292;
      this.field354 = var2;
      this.field367 = var3;
      this.field356 = 8192;
      this.field357 = 0;
      this.method904();
   }

   @ObfuscatedName("z")
   void method904() {
      this.field362 = this.field367;
      this.field358 = method980(this.field367, this.field356);
      this.field355 = method878(this.field367, this.field356);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "()Lan;"
   )
   @Export("firstSubStream")
   protected PcmStream firstSubStream() {
      return null;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "()Lan;"
   )
   @Export("nextSubStream")
   protected PcmStream nextSubStream() {
      return null;
   }

   @ObfuscatedName("n")
   protected int vmethod5793() {
      return this.field367 == 0 && this.field364 == 0 ? 0 : 1;
   }

   @ObfuscatedName("l")
   @Export("fill")
   public synchronized void fill(int[] var1, int var2, int var3) {
      if (this.field367 == 0 && this.field364 == 0) {
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
         if (this.field357 < 0) {
            if (this.field354 <= 0) {
               this.method908();
               this.remove();
               return;
            }

            this.field357 = 0;
         }

         if (this.field357 >= var7) {
            if (this.field354 >= 0) {
               this.method908();
               this.remove();
               return;
            }

            this.field357 = var7 - 1;
         }

         if (this.numLoops < 0) {
            if (this.field363) {
               if (this.field354 < 0) {
                  var9 = this.method963(var1, var2, var5, var3, var4.samples[this.start]);
                  if (this.field357 >= var5) {
                     return;
                  }

                  this.field357 = var5 + var5 - 1 - this.field357;
                  this.field354 = -this.field354;
               }

               while(true) {
                  var9 = this.method905(var1, var9, var6, var3, var4.samples[this.end - 1]);
                  if (this.field357 < var6) {
                     return;
                  }

                  this.field357 = var6 + var6 - 1 - this.field357;
                  this.field354 = -this.field354;
                  var9 = this.method963(var1, var9, var5, var3, var4.samples[this.start]);
                  if (this.field357 >= var5) {
                     return;
                  }

                  this.field357 = var5 + var5 - 1 - this.field357;
                  this.field354 = -this.field354;
               }
            } else if (this.field354 < 0) {
               while(true) {
                  var9 = this.method963(var1, var9, var5, var3, var4.samples[this.end - 1]);
                  if (this.field357 >= var5) {
                     return;
                  }

                  this.field357 = var6 - 1 - (var6 - 1 - this.field357) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method905(var1, var9, var6, var3, var4.samples[this.start]);
                  if (this.field357 < var6) {
                     return;
                  }

                  this.field357 = var5 + (this.field357 - var5) % var8;
               }
            }
         } else {
            if (this.numLoops > 0) {
               if (this.field363) {
                  label127: {
                     if (this.field354 < 0) {
                        var9 = this.method963(var1, var2, var5, var3, var4.samples[this.start]);
                        if (this.field357 >= var5) {
                           return;
                        }

                        this.field357 = var5 + var5 - 1 - this.field357;
                        this.field354 = -this.field354;
                        if (--this.numLoops == 0) {
                           break label127;
                        }
                     }

                     do {
                        var9 = this.method905(var1, var9, var6, var3, var4.samples[this.end - 1]);
                        if (this.field357 < var6) {
                           return;
                        }

                        this.field357 = var6 + var6 - 1 - this.field357;
                        this.field354 = -this.field354;
                        if (--this.numLoops == 0) {
                           break;
                        }

                        var9 = this.method963(var1, var9, var5, var3, var4.samples[this.start]);
                        if (this.field357 >= var5) {
                           return;
                        }

                        this.field357 = var5 + var5 - 1 - this.field357;
                        this.field354 = -this.field354;
                     } while(--this.numLoops != 0);
                  }
               } else {
                  int var10;
                  if (this.field354 < 0) {
                     while(true) {
                        var9 = this.method963(var1, var9, var5, var3, var4.samples[this.end - 1]);
                        if (this.field357 >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.field357) / var8;
                        if (var10 >= this.numLoops) {
                           this.field357 += var8 * this.numLoops;
                           this.numLoops = 0;
                           break;
                        }

                        this.field357 += var8 * var10;
                        this.numLoops -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.method905(var1, var9, var6, var3, var4.samples[this.start]);
                        if (this.field357 < var6) {
                           return;
                        }

                        var10 = (this.field357 - var5) / var8;
                        if (var10 >= this.numLoops) {
                           this.field357 -= var8 * this.numLoops;
                           this.numLoops = 0;
                           break;
                        }

                        this.field357 -= var8 * var10;
                        this.numLoops -= var10;
                     }
                  }
               }
            }

            if (this.field354 < 0) {
               this.method963(var1, var9, 0, var3, 0);
               if (this.field357 < 0) {
                  this.field357 = -1;
                  this.method908();
                  this.remove();
               }
            } else {
               this.method905(var1, var9, var7, var3, 0);
               if (this.field357 >= var7) {
                  this.field357 = var7;
                  this.method908();
                  this.remove();
               }
            }

         }
      }
   }

   @ObfuscatedName("k")
   @Export("setNumLoops")
   public synchronized void setNumLoops(int var1) {
      this.numLoops = var1;
   }

   @ObfuscatedName("c")
   @Export("skip")
   public synchronized void skip(int var1) {
      if (this.field364 > 0) {
         if (var1 >= this.field364) {
            if (this.field367 == Integer.MIN_VALUE) {
               this.field367 = 0;
               this.field355 = 0;
               this.field358 = 0;
               this.field362 = 0;
               this.remove();
               var1 = this.field364;
            }

            this.field364 = 0;
            this.method904();
         } else {
            this.field362 += this.field365 * var1;
            this.field358 += this.field359 * var1;
            this.field355 += this.field353 * var1;
            this.field364 -= var1;
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

      if (this.field357 < 0) {
         if (this.field354 <= 0) {
            this.method908();
            this.remove();
            return;
         }

         this.field357 = 0;
      }

      if (this.field357 >= var5) {
         if (this.field354 >= 0) {
            this.method908();
            this.remove();
            return;
         }

         this.field357 = var5 - 1;
      }

      this.field357 += this.field354 * var1;
      if (this.numLoops < 0) {
         if (!this.field363) {
            if (this.field354 < 0) {
               if (this.field357 >= var3) {
                  return;
               }

               this.field357 = var4 - 1 - (var4 - 1 - this.field357) % var6;
            } else {
               if (this.field357 < var4) {
                  return;
               }

               this.field357 = var3 + (this.field357 - var3) % var6;
            }

         } else {
            if (this.field354 < 0) {
               if (this.field357 >= var3) {
                  return;
               }

               this.field357 = var3 + var3 - 1 - this.field357;
               this.field354 = -this.field354;
            }

            while(this.field357 >= var4) {
               this.field357 = var4 + var4 - 1 - this.field357;
               this.field354 = -this.field354;
               if (this.field357 >= var3) {
                  return;
               }

               this.field357 = var3 + var3 - 1 - this.field357;
               this.field354 = -this.field354;
            }

         }
      } else {
         if (this.numLoops > 0) {
            if (this.field363) {
               label129: {
                  if (this.field354 < 0) {
                     if (this.field357 >= var3) {
                        return;
                     }

                     this.field357 = var3 + var3 - 1 - this.field357;
                     this.field354 = -this.field354;
                     if (--this.numLoops == 0) {
                        break label129;
                     }
                  }

                  do {
                     if (this.field357 < var4) {
                        return;
                     }

                     this.field357 = var4 + var4 - 1 - this.field357;
                     this.field354 = -this.field354;
                     if (--this.numLoops == 0) {
                        break;
                     }

                     if (this.field357 >= var3) {
                        return;
                     }

                     this.field357 = var3 + var3 - 1 - this.field357;
                     this.field354 = -this.field354;
                  } while(--this.numLoops != 0);
               }
            } else {
               label161: {
                  int var7;
                  if (this.field354 < 0) {
                     if (this.field357 >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.field357) / var6;
                     if (var7 >= this.numLoops) {
                        this.field357 += var6 * this.numLoops;
                        this.numLoops = 0;
                        break label161;
                     }

                     this.field357 += var6 * var7;
                     this.numLoops -= var7;
                  } else {
                     if (this.field357 < var4) {
                        return;
                     }

                     var7 = (this.field357 - var3) / var6;
                     if (var7 >= this.numLoops) {
                        this.field357 -= var6 * this.numLoops;
                        this.numLoops = 0;
                        break label161;
                     }

                     this.field357 -= var6 * var7;
                     this.numLoops -= var7;
                  }

                  return;
               }
            }
         }

         if (this.field354 < 0) {
            if (this.field357 < 0) {
               this.field357 = -1;
               this.method908();
               this.remove();
            }
         } else if (this.field357 >= var5) {
            this.field357 = var5;
            this.method908();
            this.remove();
         }

      }
   }

   @ObfuscatedName("r")
   public synchronized void method885(int var1) {
      this.method896(var1 << 6, this.method933());
   }

   @ObfuscatedName("b")
   synchronized void method886(int var1) {
      this.method896(var1, this.method933());
   }

   @ObfuscatedName("m")
   synchronized void method896(int var1, int var2) {
      this.field367 = var1;
      this.field356 = var2;
      this.field364 = 0;
      this.method904();
   }

   @ObfuscatedName("t")
   public synchronized int method888() {
      return this.field367 == Integer.MIN_VALUE ? 0 : this.field367;
   }

   @ObfuscatedName("h")
   public synchronized int method933() {
      return this.field356 < 0 ? -1 : this.field356;
   }

   @ObfuscatedName("p")
   public synchronized void method890(int var1) {
      int var2 = ((RawSound)super.sound).samples.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.field357 = var1;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Z)V",
      garbageValue = "1"
   )
   public synchronized void method911() {
      this.field354 = (this.field354 ^ this.field354 >> 31) + (this.field354 >>> 31);
      this.field354 = -this.field354;
   }

   @ObfuscatedName("u")
   void method908() {
      if (this.field364 != 0) {
         if (this.field367 == Integer.MIN_VALUE) {
            this.field367 = 0;
         }

         this.field364 = 0;
         this.method904();
      }

   }

   @ObfuscatedName("x")
   public synchronized void method893(int var1, int var2) {
      this.method894(var1, var2, this.method933());
   }

   @ObfuscatedName("a")
   public synchronized void method894(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method896(var2, var3);
      } else {
         int var4 = method980(var2, var3);
         int var5 = method878(var2, var3);
         if (var4 == this.field358 && var5 == this.field355) {
            this.field364 = 0;
         } else {
            int var6 = var2 - this.field362;
            if (this.field362 - var2 > var6) {
               var6 = this.field362 - var2;
            }

            if (var4 - this.field358 > var6) {
               var6 = var4 - this.field358;
            }

            if (this.field358 - var4 > var6) {
               var6 = this.field358 - var4;
            }

            if (var5 - this.field355 > var6) {
               var6 = var5 - this.field355;
            }

            if (this.field355 - var5 > var6) {
               var6 = this.field355 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field364 = var1;
            this.field367 = var2;
            this.field356 = var3;
            this.field365 = (var2 - this.field362) / var1;
            this.field359 = (var4 - this.field358) / var1;
            this.field353 = (var5 - this.field355) / var1;
         }
      }
   }

   @ObfuscatedName("q")
   public synchronized void method895(int var1) {
      if (var1 == 0) {
         this.method886(0);
         this.remove();
      } else if (this.field358 == 0 && this.field355 == 0) {
         this.field364 = 0;
         this.field367 = 0;
         this.field362 = 0;
         this.remove();
      } else {
         int var2 = -this.field362;
         if (this.field362 > var2) {
            var2 = this.field362;
         }

         if (-this.field358 > var2) {
            var2 = -this.field358;
         }

         if (this.field358 > var2) {
            var2 = this.field358;
         }

         if (-this.field355 > var2) {
            var2 = -this.field355;
         }

         if (this.field355 > var2) {
            var2 = this.field355;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field364 = var1;
         this.field367 = Integer.MIN_VALUE;
         this.field365 = -this.field362 / var1;
         this.field359 = -this.field358 / var1;
         this.field353 = -this.field355 / var1;
      }
   }

   @ObfuscatedName("d")
   public synchronized void method1014(int var1) {
      if (this.field354 < 0) {
         this.field354 = -var1;
      } else {
         this.field354 = var1;
      }

   }

   @ObfuscatedName("e")
   public synchronized int method979() {
      return this.field354 < 0 ? -this.field354 : this.field354;
   }

   @ObfuscatedName("g")
   public boolean method898() {
      return this.field357 < 0 || this.field357 >= ((RawSound)super.sound).samples.length << 8;
   }

   @ObfuscatedName("y")
   public boolean method899() {
      return this.field364 != 0;
   }

   @ObfuscatedName("ax")
   int method905(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field364 > 0) {
            int var6 = var2 + this.field364;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field364 += var2;
            if (this.field354 == 256 && (this.field357 & 255) == 0) {
               if (PcmPlayer.PcmPlayer_stereo) {
                  var2 = method916(0, ((RawSound)super.sound).samples, var1, this.field357, var2, this.field358, this.field355, this.field359, this.field353, 0, var6, var3, this);
               } else {
                  var2 = method915(((RawSound)super.sound).samples, var1, this.field357, var2, this.field362, this.field365, 0, var6, var3, this);
               }
            } else if (PcmPlayer.PcmPlayer_stereo) {
               var2 = method987(0, 0, ((RawSound)super.sound).samples, var1, this.field357, var2, this.field358, this.field355, this.field359, this.field353, 0, var6, var3, this, this.field354, var5);
            } else {
               var2 = method919(0, 0, ((RawSound)super.sound).samples, var1, this.field357, var2, this.field362, this.field365, 0, var6, var3, this, this.field354, var5);
            }

            this.field364 -= var2;
            if (this.field364 != 0) {
               return var2;
            }

            if (!this.method957()) {
               continue;
            }

            return var4;
         }

         if (this.field354 == 256 && (this.field357 & 255) == 0) {
            if (PcmPlayer.PcmPlayer_stereo) {
               return method880(0, ((RawSound)super.sound).samples, var1, this.field357, var2, this.field358, this.field355, 0, var4, var3, this);
            }

            return method917(((RawSound)super.sound).samples, var1, this.field357, var2, this.field362, 0, var4, var3, this);
         }

         if (PcmPlayer.PcmPlayer_stereo) {
            return method912(0, 0, ((RawSound)super.sound).samples, var1, this.field357, var2, this.field358, this.field355, 0, var4, var3, this, this.field354, var5);
         }

         return method965(0, 0, ((RawSound)super.sound).samples, var1, this.field357, var2, this.field362, 0, var4, var3, this, this.field354, var5);
      }
   }

   @ObfuscatedName("az")
   int method963(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field364 > 0) {
            int var6 = var2 + this.field364;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field364 += var2;
            if (this.field354 == -256 && (this.field357 & 255) == 0) {
               if (PcmPlayer.PcmPlayer_stereo) {
                  var2 = method918(0, ((RawSound)super.sound).samples, var1, this.field357, var2, this.field358, this.field355, this.field359, this.field353, 0, var6, var3, this);
               } else {
                  var2 = method1002(((RawSound)super.sound).samples, var1, this.field357, var2, this.field362, this.field365, 0, var6, var3, this);
               }
            } else if (PcmPlayer.PcmPlayer_stereo) {
               var2 = method922(0, 0, ((RawSound)super.sound).samples, var1, this.field357, var2, this.field358, this.field355, this.field359, this.field353, 0, var6, var3, this, this.field354, var5);
            } else {
               var2 = method921(0, 0, ((RawSound)super.sound).samples, var1, this.field357, var2, this.field362, this.field365, 0, var6, var3, this, this.field354, var5);
            }

            this.field364 -= var2;
            if (this.field364 != 0) {
               return var2;
            }

            if (!this.method957()) {
               continue;
            }

            return var4;
         }

         if (this.field354 == -256 && (this.field357 & 255) == 0) {
            if (PcmPlayer.PcmPlayer_stereo) {
               return method910(0, ((RawSound)super.sound).samples, var1, this.field357, var2, this.field358, this.field355, 0, var4, var3, this);
            }

            return method909(((RawSound)super.sound).samples, var1, this.field357, var2, this.field362, 0, var4, var3, this);
         }

         if (PcmPlayer.PcmPlayer_stereo) {
            return method914(0, 0, ((RawSound)super.sound).samples, var1, this.field357, var2, this.field358, this.field355, 0, var4, var3, this, this.field354, var5);
         }

         return method959(0, 0, ((RawSound)super.sound).samples, var1, this.field357, var2, this.field362, 0, var4, var3, this, this.field354, var5);
      }
   }

   @ObfuscatedName("ap")
   boolean method957() {
      int var1 = this.field367;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method980(var1, this.field356);
         var3 = method878(var1, this.field356);
      }

      if (var1 == this.field362 && var2 == this.field358 && var3 == this.field355) {
         if (this.field367 == Integer.MIN_VALUE) {
            this.field367 = 0;
            this.field355 = 0;
            this.field358 = 0;
            this.field362 = 0;
            this.remove();
            return true;
         } else {
            this.method904();
            return false;
         }
      } else {
         if (this.field362 < var1) {
            this.field365 = 1;
            this.field364 = var1 - this.field362;
         } else if (this.field362 > var1) {
            this.field365 = -1;
            this.field364 = this.field362 - var1;
         } else {
            this.field365 = 0;
         }

         if (this.field358 < var2) {
            this.field359 = 1;
            if (this.field364 == 0 || this.field364 > var2 - this.field358) {
               this.field364 = var2 - this.field358;
            }
         } else if (this.field358 > var2) {
            this.field359 = -1;
            if (this.field364 == 0 || this.field364 > this.field358 - var2) {
               this.field364 = this.field358 - var2;
            }
         } else {
            this.field359 = 0;
         }

         if (this.field355 < var3) {
            this.field353 = 1;
            if (this.field364 == 0 || this.field364 > var3 - this.field355) {
               this.field364 = var3 - this.field355;
            }
         } else if (this.field355 > var3) {
            this.field353 = -1;
            if (this.field364 == 0 || this.field364 > this.field355 - var3) {
               this.field364 = this.field355 - var3;
            }
         } else {
            this.field353 = 0;
         }

         return false;
      }
   }

   @ObfuscatedName("av")
   int vmethod1026() {
      int var1 = this.field362 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.numLoops == 0) {
         var1 -= var1 * this.field357 / (((RawSound)super.sound).samples.length << 8);
      } else if (this.numLoops >= 0) {
         var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   @ObfuscatedName("f")
   static int method980(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4) + 0.5);
   }

   @ObfuscatedName("w")
   static int method878(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4) + 0.5);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lav;II)Lab;"
   )
   @Export("createRawPcmStream")
   public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
      return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(class284.field3321 * 100)), var2 << 6) : null;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lav;III)Lab;"
   )
   public static RawPcmStream method913(RawSound var0, int var1, int var2, int var3) {
      return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIILab;)I"
   )
   static int method917(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.field357 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIILab;)I"
   )
   static int method880(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
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

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field357 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIILab;)I"
   )
   static int method909(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.field357 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIILab;)I"
   )
   static int method910(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
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

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field357 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIILab;II)I"
   )
   static int method965(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.field357 = var4;
      return var5;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILab;II)I"
   )
   static int method912(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
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

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field357 = var4;
      return var5 >> 1;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIILab;II)I"
   )
   static int method959(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
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

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.field357 = var4;
      return var5;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILab;II)I"
   )
   static int method914(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
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

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field357 = var4;
      return var5 >> 1;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIIILab;)I"
   )
   static int method915(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field358 += var9.field359 * (var6 - var3);
      var9.field355 += var9.field353 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
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

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.field362 = var4 >> 2;
      var9.field357 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIIIILab;)I"
   )
   static int method916(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var11 + var4 - var3) > var10) {
         var9 = var10;
      }

      var12.field362 += var12.field365 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
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

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field358 = var5 >> 2;
      var12.field355 = var6 >> 2;
      var12.field357 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIIILab;)I"
   )
   static int method1002(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field358 += var9.field359 * (var6 - var3);
      var9.field355 += var9.field353 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
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

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.field362 = var4 >> 2;
      var9.field357 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIIIILab;)I"
   )
   static int method918(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field362 += var12.field365 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
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

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field358 = var5 >> 2;
      var12.field355 = var6 >> 2;
      var12.field357 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILab;II)I"
   )
   static int method919(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
      var11.field358 -= var11.field359 * var5;
      var11.field355 -= var11.field353 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
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

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field358 += var11.field359 * var5;
      var11.field355 += var11.field353 * var5;
      var11.field362 = var6;
      var11.field357 = var4;
      return var5;
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIIIILab;II)I"
   )
   static int method987(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
      var13.field362 -= var5 * var13.field365;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
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

      for(var1 = var15; var5 < var10; var4 += var14) {
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
      var13.field362 += var13.field365 * var5;
      var13.field358 = var6;
      var13.field355 = var7;
      var13.field357 = var4;
      return var5;
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILab;II)I"
   )
   static int method921(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
      var11.field358 -= var11.field359 * var5;
      var11.field355 -= var11.field353 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
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

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field358 += var11.field359 * var5;
      var11.field355 += var11.field353 * var5;
      var11.field362 = var6;
      var11.field357 = var4;
      return var5;
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIIIILab;II)I"
   )
   static int method922(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
      var13.field362 -= var5 * var13.field365;
      if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
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

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field362 += var13.field365 * var5;
      var13.field358 = var6;
      var13.field355 = var7;
      var13.field357 = var4;
      return var5;
   }
}
