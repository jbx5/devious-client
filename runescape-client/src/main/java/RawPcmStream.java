import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
   @ObfuscatedName("a")
   int field360;
   @ObfuscatedName("f")
   int field349;
   @ObfuscatedName("c")
   int field350;
   @ObfuscatedName("x")
   int field351;
   @ObfuscatedName("h")
   int field352;
   @ObfuscatedName("j")
   int field353;
   @ObfuscatedName("y")
   int field354;
   @ObfuscatedName("d")
   @Export("numLoops")
   int numLoops;
   @ObfuscatedName("n")
   @Export("start")
   int start;
   @ObfuscatedName("r")
   @Export("end")
   int end;
   @ObfuscatedName("l")
   boolean field361;
   @ObfuscatedName("s")
   int field359;
   @ObfuscatedName("p")
   int field358;
   @ObfuscatedName("b")
   int field355;
   @ObfuscatedName("o")
   int field362;

   @ObfuscatedSignature(
      descriptor = "(Lam;III)V"
   )
   RawPcmStream(RawSound var1, int var2, int var3, int var4) {
      super.sound = var1;
      this.start = var1.start;
      this.end = var1.end;
      this.field361 = var1.field284;
      this.field349 = var2;
      this.field350 = var3;
      this.field351 = var4;
      this.field360 = 0;
      this.method890();
   }

   @ObfuscatedSignature(
      descriptor = "(Lam;II)V"
   )
   RawPcmStream(RawSound var1, int var2, int var3) {
      super.sound = var1;
      this.start = var1.start;
      this.end = var1.end;
      this.field361 = var1.field284;
      this.field349 = var2;
      this.field350 = var3;
      this.field351 = 8192;
      this.field360 = 0;
      this.method890();
   }

   @ObfuscatedName("h")
   void method890() {
      this.field352 = this.field350;
      this.field353 = method1010(this.field350, this.field351);
      this.field354 = method1016(this.field350, this.field351);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "()Lay;"
   )
   @Export("firstSubStream")
   protected PcmStream firstSubStream() {
      return null;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "()Lay;"
   )
   @Export("nextSubStream")
   protected PcmStream nextSubStream() {
      return null;
   }

   @ObfuscatedName("d")
   protected int vmethod5648() {
      return this.field350 == 0 && this.field359 == 0 ? 0 : 1;
   }

   @ObfuscatedName("n")
   @Export("fill")
   public synchronized void fill(int[] var1, int var2, int var3) {
      if (this.field350 == 0 && this.field359 == 0) {
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
         if (this.field360 < 0) {
            if (this.field349 <= 0) {
               this.method899();
               this.remove();
               return;
            }

            this.field360 = 0;
         }

         if (this.field360 >= var7) {
            if (this.field349 >= 0) {
               this.method899();
               this.remove();
               return;
            }

            this.field360 = var7 - 1;
         }

         if (this.numLoops < 0) {
            if (this.field361) {
               if (this.field349 < 0) {
                  var9 = this.method913(var1, var2, var5, var3, var4.samples[this.start]);
                  if (this.field360 >= var5) {
                     return;
                  }

                  this.field360 = var5 + var5 - 1 - this.field360;
                  this.field349 = -this.field349;
               }

               while(true) {
                  var9 = this.method912(var1, var9, var6, var3, var4.samples[this.end - 1]);
                  if (this.field360 < var6) {
                     return;
                  }

                  this.field360 = var6 + var6 - 1 - this.field360;
                  this.field349 = -this.field349;
                  var9 = this.method913(var1, var9, var5, var3, var4.samples[this.start]);
                  if (this.field360 >= var5) {
                     return;
                  }

                  this.field360 = var5 + var5 - 1 - this.field360;
                  this.field349 = -this.field349;
               }
            } else if (this.field349 < 0) {
               while(true) {
                  var9 = this.method913(var1, var9, var5, var3, var4.samples[this.end - 1]);
                  if (this.field360 >= var5) {
                     return;
                  }

                  this.field360 = var6 - 1 - (var6 - 1 - this.field360) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method912(var1, var9, var6, var3, var4.samples[this.start]);
                  if (this.field360 < var6) {
                     return;
                  }

                  this.field360 = var5 + (this.field360 - var5) % var8;
               }
            }
         } else {
            if (this.numLoops > 0) {
               if (this.field361) {
                  label127: {
                     if (this.field349 < 0) {
                        var9 = this.method913(var1, var2, var5, var3, var4.samples[this.start]);
                        if (this.field360 >= var5) {
                           return;
                        }

                        this.field360 = var5 + var5 - 1 - this.field360;
                        this.field349 = -this.field349;
                        if (--this.numLoops == 0) {
                           break label127;
                        }
                     }

                     do {
                        var9 = this.method912(var1, var9, var6, var3, var4.samples[this.end - 1]);
                        if (this.field360 < var6) {
                           return;
                        }

                        this.field360 = var6 + var6 - 1 - this.field360;
                        this.field349 = -this.field349;
                        if (--this.numLoops == 0) {
                           break;
                        }

                        var9 = this.method913(var1, var9, var5, var3, var4.samples[this.start]);
                        if (this.field360 >= var5) {
                           return;
                        }

                        this.field360 = var5 + var5 - 1 - this.field360;
                        this.field349 = -this.field349;
                     } while(--this.numLoops != 0);
                  }
               } else {
                  int var10;
                  if (this.field349 < 0) {
                     while(true) {
                        var9 = this.method913(var1, var9, var5, var3, var4.samples[this.end - 1]);
                        if (this.field360 >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.field360) / var8;
                        if (var10 >= this.numLoops) {
                           this.field360 += var8 * this.numLoops;
                           this.numLoops = 0;
                           break;
                        }

                        this.field360 += var8 * var10;
                        this.numLoops -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.method912(var1, var9, var6, var3, var4.samples[this.start]);
                        if (this.field360 < var6) {
                           return;
                        }

                        var10 = (this.field360 - var5) / var8;
                        if (var10 >= this.numLoops) {
                           this.field360 -= var8 * this.numLoops;
                           this.numLoops = 0;
                           break;
                        }

                        this.field360 -= var8 * var10;
                        this.numLoops -= var10;
                     }
                  }
               }
            }

            if (this.field349 < 0) {
               this.method913(var1, var9, 0, var3, 0);
               if (this.field360 < 0) {
                  this.field360 = -1;
                  this.method899();
                  this.remove();
               }
            } else {
               this.method912(var1, var9, var7, var3, 0);
               if (this.field360 >= var7) {
                  this.field360 = var7;
                  this.method899();
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

   @ObfuscatedName("l")
   @Export("skip")
   public synchronized void skip(int var1) {
      if (this.field359 > 0) {
         if (var1 >= this.field359) {
            if (this.field350 == Integer.MIN_VALUE) {
               this.field350 = 0;
               this.field354 = 0;
               this.field353 = 0;
               this.field352 = 0;
               this.remove();
               var1 = this.field359;
            }

            this.field359 = 0;
            this.method890();
         } else {
            this.field352 += this.field358 * var1;
            this.field353 += this.field355 * var1;
            this.field354 += this.field362 * var1;
            this.field359 -= var1;
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

      if (this.field360 < 0) {
         if (this.field349 <= 0) {
            this.method899();
            this.remove();
            return;
         }

         this.field360 = 0;
      }

      if (this.field360 >= var5) {
         if (this.field349 >= 0) {
            this.method899();
            this.remove();
            return;
         }

         this.field360 = var5 - 1;
      }

      this.field360 += this.field349 * var1;
      if (this.numLoops < 0) {
         if (!this.field361) {
            if (this.field349 < 0) {
               if (this.field360 >= var3) {
                  return;
               }

               this.field360 = var4 - 1 - (var4 - 1 - this.field360) % var6;
            } else {
               if (this.field360 < var4) {
                  return;
               }

               this.field360 = var3 + (this.field360 - var3) % var6;
            }

         } else {
            if (this.field349 < 0) {
               if (this.field360 >= var3) {
                  return;
               }

               this.field360 = var3 + var3 - 1 - this.field360;
               this.field349 = -this.field349;
            }

            while(this.field360 >= var4) {
               this.field360 = var4 + var4 - 1 - this.field360;
               this.field349 = -this.field349;
               if (this.field360 >= var3) {
                  return;
               }

               this.field360 = var3 + var3 - 1 - this.field360;
               this.field349 = -this.field349;
            }

         }
      } else {
         if (this.numLoops > 0) {
            if (this.field361) {
               label129: {
                  if (this.field349 < 0) {
                     if (this.field360 >= var3) {
                        return;
                     }

                     this.field360 = var3 + var3 - 1 - this.field360;
                     this.field349 = -this.field349;
                     if (--this.numLoops == 0) {
                        break label129;
                     }
                  }

                  do {
                     if (this.field360 < var4) {
                        return;
                     }

                     this.field360 = var4 + var4 - 1 - this.field360;
                     this.field349 = -this.field349;
                     if (--this.numLoops == 0) {
                        break;
                     }

                     if (this.field360 >= var3) {
                        return;
                     }

                     this.field360 = var3 + var3 - 1 - this.field360;
                     this.field349 = -this.field349;
                  } while(--this.numLoops != 0);
               }
            } else {
               label161: {
                  int var7;
                  if (this.field349 < 0) {
                     if (this.field360 >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.field360) / var6;
                     if (var7 >= this.numLoops) {
                        this.field360 += var6 * this.numLoops;
                        this.numLoops = 0;
                        break label161;
                     }

                     this.field360 += var6 * var7;
                     this.numLoops -= var7;
                  } else {
                     if (this.field360 < var4) {
                        return;
                     }

                     var7 = (this.field360 - var3) / var6;
                     if (var7 >= this.numLoops) {
                        this.field360 -= var6 * this.numLoops;
                        this.numLoops = 0;
                        break label161;
                     }

                     this.field360 -= var6 * var7;
                     this.numLoops -= var7;
                  }

                  return;
               }
            }
         }

         if (this.field349 < 0) {
            if (this.field360 < 0) {
               this.field360 = -1;
               this.method899();
               this.remove();
            }
         } else if (this.field360 >= var5) {
            this.field360 = var5;
            this.method899();
            this.remove();
         }

      }
   }

   @ObfuscatedName("s")
   public synchronized void method892(int var1) {
      this.method919(var1 << 6, this.method896());
   }

   @ObfuscatedName("p")
   synchronized void method970(int var1) {
      this.method919(var1, this.method896());
   }

   @ObfuscatedName("b")
   synchronized void method919(int var1, int var2) {
      this.field350 = var1;
      this.field351 = var2;
      this.field359 = 0;
      this.method890();
   }

   @ObfuscatedName("o")
   public synchronized int method935() {
      return this.field350 == Integer.MIN_VALUE ? 0 : this.field350;
   }

   @ObfuscatedName("u")
   public synchronized int method896() {
      return this.field351 < 0 ? -1 : this.field351;
   }

   @ObfuscatedName("z")
   public synchronized void method1007(int var1) {
      int var2 = ((RawSound)super.sound).samples.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.field360 = var1;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(Z)V",
      garbageValue = "1"
   )
   public synchronized void method898() {
      this.field349 = (this.field349 ^ this.field349 >> 31) + (this.field349 >>> 31);
      this.field349 = -this.field349;
   }

   @ObfuscatedName("w")
   void method899() {
      if (this.field359 != 0) {
         if (this.field350 == Integer.MIN_VALUE) {
            this.field350 = 0;
         }

         this.field359 = 0;
         this.method890();
      }

   }

   @ObfuscatedName("m")
   public synchronized void method900(int var1, int var2) {
      this.method884(var1, var2, this.method896());
   }

   @ObfuscatedName("q")
   public synchronized void method884(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method919(var2, var3);
      } else {
         int var4 = method1010(var2, var3);
         int var5 = method1016(var2, var3);
         if (var4 == this.field353 && var5 == this.field354) {
            this.field359 = 0;
         } else {
            int var6 = var2 - this.field352;
            if (this.field352 - var2 > var6) {
               var6 = this.field352 - var2;
            }

            if (var4 - this.field353 > var6) {
               var6 = var4 - this.field353;
            }

            if (this.field353 - var4 > var6) {
               var6 = this.field353 - var4;
            }

            if (var5 - this.field354 > var6) {
               var6 = var5 - this.field354;
            }

            if (this.field354 - var5 > var6) {
               var6 = this.field354 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field359 = var1;
            this.field350 = var2;
            this.field351 = var3;
            this.field358 = (var2 - this.field352) / var1;
            this.field355 = (var4 - this.field353) / var1;
            this.field362 = (var5 - this.field354) / var1;
         }
      }
   }

   @ObfuscatedName("i")
   public synchronized void method893(int var1) {
      if (var1 == 0) {
         this.method970(0);
         this.remove();
      } else if (this.field353 == 0 && this.field354 == 0) {
         this.field359 = 0;
         this.field350 = 0;
         this.field352 = 0;
         this.remove();
      } else {
         int var2 = -this.field352;
         if (this.field352 > var2) {
            var2 = this.field352;
         }

         if (-this.field353 > var2) {
            var2 = -this.field353;
         }

         if (this.field353 > var2) {
            var2 = this.field353;
         }

         if (-this.field354 > var2) {
            var2 = -this.field354;
         }

         if (this.field354 > var2) {
            var2 = this.field354;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field359 = var1;
         this.field350 = Integer.MIN_VALUE;
         this.field358 = -this.field352 / var1;
         this.field355 = -this.field353 / var1;
         this.field362 = -this.field354 / var1;
      }
   }

   @ObfuscatedName("e")
   public synchronized void method944(int var1) {
      if (this.field349 < 0) {
         this.field349 = -var1;
      } else {
         this.field349 = var1;
      }

   }

   @ObfuscatedName("ao")
   public synchronized int method904() {
      return this.field349 < 0 ? -this.field349 : this.field349;
   }

   @ObfuscatedName("ac")
   public boolean method905() {
      return this.field360 < 0 || this.field360 >= ((RawSound)super.sound).samples.length << 8;
   }

   @ObfuscatedName("af")
   public boolean method895() {
      return this.field359 != 0;
   }

   @ObfuscatedName("av")
   int method912(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field359 > 0) {
            int var6 = var2 + this.field359;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field359 += var2;
            if (this.field349 == 256 && (this.field360 & 255) == 0) {
               if (class157.PcmPlayer_stereo) {
                  var2 = method924(0, ((RawSound)super.sound).samples, var1, this.field360, var2, this.field353, this.field354, this.field355, this.field362, 0, var6, var3, this);
               } else {
                  var2 = method923(((RawSound)super.sound).samples, var1, this.field360, var2, this.field352, this.field358, 0, var6, var3, this);
               }
            } else if (class157.PcmPlayer_stereo) {
               var2 = method928(0, 0, ((RawSound)super.sound).samples, var1, this.field360, var2, this.field353, this.field354, this.field355, this.field362, 0, var6, var3, this, this.field349, var5);
            } else {
               var2 = method927(0, 0, ((RawSound)super.sound).samples, var1, this.field360, var2, this.field352, this.field358, 0, var6, var3, this, this.field349, var5);
            }

            this.field359 -= var2;
            if (this.field359 != 0) {
               return var2;
            }

            if (!this.method914()) {
               continue;
            }

            return var4;
         }

         if (this.field349 == 256 && (this.field360 & 255) == 0) {
            if (class157.PcmPlayer_stereo) {
               return method963(0, ((RawSound)super.sound).samples, var1, this.field360, var2, this.field353, this.field354, 0, var4, var3, this);
            }

            return method915(((RawSound)super.sound).samples, var1, this.field360, var2, this.field352, 0, var4, var3, this);
         }

         if (class157.PcmPlayer_stereo) {
            return method897(0, 0, ((RawSound)super.sound).samples, var1, this.field360, var2, this.field353, this.field354, 0, var4, var3, this, this.field349, var5);
         }

         return method983(0, 0, ((RawSound)super.sound).samples, var1, this.field360, var2, this.field352, 0, var4, var3, this, this.field349, var5);
      }
   }

   @ObfuscatedName("ae")
   int vmethod1019() {
      int var1 = this.field352 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.numLoops == 0) {
         var1 -= var1 * this.field360 / (((RawSound)super.sound).samples.length << 8);
      } else if (this.numLoops >= 0) {
         var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   @ObfuscatedName("ap")
   int method913(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field359 > 0) {
            int var6 = var2 + this.field359;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field359 += var2;
            if (this.field349 == -256 && (this.field360 & 255) == 0) {
               if (class157.PcmPlayer_stereo) {
                  var2 = method926(0, ((RawSound)super.sound).samples, var1, this.field360, var2, this.field353, this.field354, this.field355, this.field362, 0, var6, var3, this);
               } else {
                  var2 = method980(((RawSound)super.sound).samples, var1, this.field360, var2, this.field352, this.field358, 0, var6, var3, this);
               }
            } else if (class157.PcmPlayer_stereo) {
               var2 = method930(0, 0, ((RawSound)super.sound).samples, var1, this.field360, var2, this.field353, this.field354, this.field355, this.field362, 0, var6, var3, this, this.field349, var5);
            } else {
               var2 = method1011(0, 0, ((RawSound)super.sound).samples, var1, this.field360, var2, this.field352, this.field358, 0, var6, var3, this, this.field349, var5);
            }

            this.field359 -= var2;
            if (this.field359 != 0) {
               return var2;
            }

            if (!this.method914()) {
               continue;
            }

            return var4;
         }

         if (this.field349 == -256 && (this.field360 & 255) == 0) {
            if (class157.PcmPlayer_stereo) {
               return method918(0, ((RawSound)super.sound).samples, var1, this.field360, var2, this.field353, this.field354, 0, var4, var3, this);
            }

            return method917(((RawSound)super.sound).samples, var1, this.field360, var2, this.field352, 0, var4, var3, this);
         }

         if (class157.PcmPlayer_stereo) {
            return method922(0, 0, ((RawSound)super.sound).samples, var1, this.field360, var2, this.field353, this.field354, 0, var4, var3, this, this.field349, var5);
         }

         return method921(0, 0, ((RawSound)super.sound).samples, var1, this.field360, var2, this.field352, 0, var4, var3, this, this.field349, var5);
      }
   }

   @ObfuscatedName("as")
   boolean method914() {
      int var1 = this.field350;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method1010(var1, this.field351);
         var3 = method1016(var1, this.field351);
      }

      if (var1 == this.field352 && var2 == this.field353 && var3 == this.field354) {
         if (this.field350 == Integer.MIN_VALUE) {
            this.field350 = 0;
            this.field354 = 0;
            this.field353 = 0;
            this.field352 = 0;
            this.remove();
            return true;
         } else {
            this.method890();
            return false;
         }
      } else {
         if (this.field352 < var1) {
            this.field358 = 1;
            this.field359 = var1 - this.field352;
         } else if (this.field352 > var1) {
            this.field358 = -1;
            this.field359 = this.field352 - var1;
         } else {
            this.field358 = 0;
         }

         if (this.field353 < var2) {
            this.field355 = 1;
            if (this.field359 == 0 || this.field359 > var2 - this.field353) {
               this.field359 = var2 - this.field353;
            }
         } else if (this.field353 > var2) {
            this.field355 = -1;
            if (this.field359 == 0 || this.field359 > this.field353 - var2) {
               this.field359 = this.field353 - var2;
            }
         } else {
            this.field355 = 0;
         }

         if (this.field354 < var3) {
            this.field362 = 1;
            if (this.field359 == 0 || this.field359 > var3 - this.field354) {
               this.field359 = var3 - this.field354;
            }
         } else if (this.field354 > var3) {
            this.field362 = -1;
            if (this.field359 == 0 || this.field359 > this.field354 - var3) {
               this.field359 = this.field354 - var3;
            }
         } else {
            this.field362 = 0;
         }

         return false;
      }
   }

   @ObfuscatedName("a")
   static int method1010(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4) + 0.5);
   }

   @ObfuscatedName("f")
   static int method1016(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4) + 0.5);
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lam;II)Lar;"
   )
   @Export("createRawPcmStream")
   public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
      return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(SoundCache.field337 * 100)), var2 << 6) : null;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lam;III)Lar;"
   )
   public static RawPcmStream method889(RawSound var0, int var1, int var2, int var3) {
      return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIILar;)I"
   )
   static int method915(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

      var8.field360 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIILar;)I"
   )
   static int method963(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

      var10.field360 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIILar;)I"
   )
   static int method917(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

      var8.field360 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIILar;)I"
   )
   static int method918(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

      var10.field360 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIILar;II)I"
   )
   static int method983(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

      var10.field360 = var4;
      return var5;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILar;II)I"
   )
   static int method897(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

      var11.field360 = var4;
      return var5 >> 1;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIILar;II)I"
   )
   static int method921(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

      var10.field360 = var4;
      return var5;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILar;II)I"
   )
   static int method922(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

      var11.field360 = var4;
      return var5 >> 1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIIILar;)I"
   )
   static int method923(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field353 += var9.field355 * (var6 - var3);
      var9.field354 += var9.field362 * (var6 - var3);

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

      var9.field352 = var4 >> 2;
      var9.field360 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIIIILar;)I"
   )
   static int method924(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var11 + var4 - var3) > var10) {
         var9 = var10;
      }

      var12.field352 += var12.field358 * (var9 - var4);
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

      var12.field353 = var5 >> 2;
      var12.field354 = var6 >> 2;
      var12.field360 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIIILar;)I"
   )
   static int method980(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field353 += var9.field355 * (var6 - var3);
      var9.field354 += var9.field362 * (var6 - var3);

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

      var9.field352 = var4 >> 2;
      var9.field360 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIIIILar;)I"
   )
   static int method926(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field352 += var12.field358 * (var9 - var4);
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

      var12.field353 = var5 >> 2;
      var12.field354 = var6 >> 2;
      var12.field360 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILar;II)I"
   )
   static int method927(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
      var11.field353 -= var11.field355 * var5;
      var11.field354 -= var11.field362 * var5;
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

      var11.field353 += var11.field355 * var5;
      var11.field354 += var11.field362 * var5;
      var11.field352 = var6;
      var11.field360 = var4;
      return var5;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIIIILar;II)I"
   )
   static int method928(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
      var13.field352 -= var5 * var13.field358;
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
      var13.field352 += var13.field358 * var5;
      var13.field353 = var6;
      var13.field354 = var7;
      var13.field360 = var4;
      return var5;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILar;II)I"
   )
   static int method1011(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
      var11.field353 -= var11.field355 * var5;
      var11.field354 -= var11.field362 * var5;
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

      var11.field353 += var11.field355 * var5;
      var11.field354 += var11.field362 * var5;
      var11.field352 = var6;
      var11.field360 = var4;
      return var5;
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIIIILar;II)I"
   )
   static int method930(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
      var13.field352 -= var5 * var13.field358;
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
      var13.field352 += var13.field358 * var5;
      var13.field353 = var6;
      var13.field354 = var7;
      var13.field360 = var4;
      return var5;
   }
}
