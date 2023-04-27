import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
   @ObfuscatedName("af")
   int field349;
   @ObfuscatedName("an")
   int field348;
   @ObfuscatedName("aw")
   int field355;
   @ObfuscatedName("ac")
   int field350;
   @ObfuscatedName("au")
   int field351;
   @ObfuscatedName("ab")
   int field352;
   @ObfuscatedName("aq")
   int field353;
   @ObfuscatedName("al")
   @Export("numLoops")
   int numLoops;
   @ObfuscatedName("at")
   @Export("start")
   int start;
   @ObfuscatedName("aa")
   @Export("end")
   int end;
   @ObfuscatedName("ay")
   boolean field357;
   @ObfuscatedName("ao")
   int field358;
   @ObfuscatedName("ax")
   int field354;
   @ObfuscatedName("ai")
   int field347;
   @ObfuscatedName("ag")
   int field361;

   @ObfuscatedSignature(
      descriptor = "(Lbr;III)V"
   )
   RawPcmStream(RawSound var1, int var2, int var3, int var4) {
      super.sound = var1;
      this.start = var1.start;
      this.end = var1.end;
      this.field357 = var1.field280;
      this.field348 = var2;
      this.field355 = var3;
      this.field350 = var4;
      this.field349 = 0;
      this.method904();
   }

   @ObfuscatedSignature(
      descriptor = "(Lbr;II)V"
   )
   RawPcmStream(RawSound var1, int var2, int var3) {
      super.sound = var1;
      this.start = var1.start;
      this.end = var1.end;
      this.field357 = var1.field280;
      this.field348 = var2;
      this.field355 = var3;
      this.field350 = 8192;
      this.field349 = 0;
      this.method904();
   }

   @ObfuscatedName("au")
   void method904() {
      this.field351 = this.field355;
      this.field352 = method992(this.field355, this.field350);
      this.field353 = method899(this.field355, this.field350);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "()Lbp;"
   )
   @Export("firstSubStream")
   protected PcmStream firstSubStream() {
      return null;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "()Lbp;"
   )
   @Export("nextSubStream")
   protected PcmStream nextSubStream() {
      return null;
   }

   @ObfuscatedName("al")
   protected int vmethod5949() {
      return this.field355 == 0 && this.field358 == 0 ? 0 : 1;
   }

   @ObfuscatedName("at")
   @Export("fill")
   public synchronized void fill(int[] var1, int var2, int var3) {
      if (this.field355 == 0 && this.field358 == 0) {
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
         if (this.field349 < 0) {
            if (this.field348 <= 0) {
               this.method913();
               this.remove();
               return;
            }

            this.field349 = 0;
         }

         if (this.field349 >= var7) {
            if (this.field348 >= 0) {
               this.method913();
               this.remove();
               return;
            }

            this.field349 = var7 - 1;
         }

         if (this.numLoops < 0) {
            if (this.field357) {
               if (this.field348 < 0) {
                  var9 = this.method927(var1, var2, var5, var3, var4.samples[this.start]);
                  if (this.field349 >= var5) {
                     return;
                  }

                  this.field349 = var5 + var5 - 1 - this.field349;
                  this.field348 = -this.field348;
               }

               while(true) {
                  var9 = this.method926(var1, var9, var6, var3, var4.samples[this.end - 1]);
                  if (this.field349 < var6) {
                     return;
                  }

                  this.field349 = var6 + var6 - 1 - this.field349;
                  this.field348 = -this.field348;
                  var9 = this.method927(var1, var9, var5, var3, var4.samples[this.start]);
                  if (this.field349 >= var5) {
                     return;
                  }

                  this.field349 = var5 + var5 - 1 - this.field349;
                  this.field348 = -this.field348;
               }
            } else if (this.field348 < 0) {
               while(true) {
                  var9 = this.method927(var1, var9, var5, var3, var4.samples[this.end - 1]);
                  if (this.field349 >= var5) {
                     return;
                  }

                  this.field349 = var6 - 1 - (var6 - 1 - this.field349) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method926(var1, var9, var6, var3, var4.samples[this.start]);
                  if (this.field349 < var6) {
                     return;
                  }

                  this.field349 = var5 + (this.field349 - var5) % var8;
               }
            }
         } else {
            if (this.numLoops > 0) {
               if (this.field357) {
                  label127: {
                     if (this.field348 < 0) {
                        var9 = this.method927(var1, var2, var5, var3, var4.samples[this.start]);
                        if (this.field349 >= var5) {
                           return;
                        }

                        this.field349 = var5 + var5 - 1 - this.field349;
                        this.field348 = -this.field348;
                        if (--this.numLoops == 0) {
                           break label127;
                        }
                     }

                     do {
                        var9 = this.method926(var1, var9, var6, var3, var4.samples[this.end - 1]);
                        if (this.field349 < var6) {
                           return;
                        }

                        this.field349 = var6 + var6 - 1 - this.field349;
                        this.field348 = -this.field348;
                        if (--this.numLoops == 0) {
                           break;
                        }

                        var9 = this.method927(var1, var9, var5, var3, var4.samples[this.start]);
                        if (this.field349 >= var5) {
                           return;
                        }

                        this.field349 = var5 + var5 - 1 - this.field349;
                        this.field348 = -this.field348;
                     } while(--this.numLoops != 0);
                  }
               } else {
                  int var10;
                  if (this.field348 < 0) {
                     while(true) {
                        var9 = this.method927(var1, var9, var5, var3, var4.samples[this.end - 1]);
                        if (this.field349 >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.field349) / var8;
                        if (var10 >= this.numLoops) {
                           this.field349 += var8 * this.numLoops;
                           this.numLoops = 0;
                           break;
                        }

                        this.field349 += var8 * var10;
                        this.numLoops -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.method926(var1, var9, var6, var3, var4.samples[this.start]);
                        if (this.field349 < var6) {
                           return;
                        }

                        var10 = (this.field349 - var5) / var8;
                        if (var10 >= this.numLoops) {
                           this.field349 -= var8 * this.numLoops;
                           this.numLoops = 0;
                           break;
                        }

                        this.field349 -= var8 * var10;
                        this.numLoops -= var10;
                     }
                  }
               }
            }

            if (this.field348 < 0) {
               this.method927(var1, var9, 0, var3, 0);
               if (this.field349 < 0) {
                  this.field349 = -1;
                  this.method913();
                  this.remove();
               }
            } else {
               this.method926(var1, var9, var7, var3, 0);
               if (this.field349 >= var7) {
                  this.field349 = var7;
                  this.method913();
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

   @ObfuscatedName("ay")
   @Export("skip")
   public synchronized void skip(int var1) {
      if (this.field358 > 0) {
         if (var1 >= this.field358) {
            if (this.field355 == Integer.MIN_VALUE) {
               this.field355 = 0;
               this.field353 = 0;
               this.field352 = 0;
               this.field351 = 0;
               this.remove();
               var1 = this.field358;
            }

            this.field358 = 0;
            this.method904();
         } else {
            this.field351 += this.field354 * var1;
            this.field352 += this.field347 * var1;
            this.field353 += this.field361 * var1;
            this.field358 -= var1;
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

      if (this.field349 < 0) {
         if (this.field348 <= 0) {
            this.method913();
            this.remove();
            return;
         }

         this.field349 = 0;
      }

      if (this.field349 >= var5) {
         if (this.field348 >= 0) {
            this.method913();
            this.remove();
            return;
         }

         this.field349 = var5 - 1;
      }

      this.field349 += this.field348 * var1;
      if (this.numLoops < 0) {
         if (!this.field357) {
            if (this.field348 < 0) {
               if (this.field349 >= var3) {
                  return;
               }

               this.field349 = var4 - 1 - (var4 - 1 - this.field349) % var6;
            } else {
               if (this.field349 < var4) {
                  return;
               }

               this.field349 = var3 + (this.field349 - var3) % var6;
            }

         } else {
            if (this.field348 < 0) {
               if (this.field349 >= var3) {
                  return;
               }

               this.field349 = var3 + var3 - 1 - this.field349;
               this.field348 = -this.field348;
            }

            while(this.field349 >= var4) {
               this.field349 = var4 + var4 - 1 - this.field349;
               this.field348 = -this.field348;
               if (this.field349 >= var3) {
                  return;
               }

               this.field349 = var3 + var3 - 1 - this.field349;
               this.field348 = -this.field348;
            }

         }
      } else {
         if (this.numLoops > 0) {
            if (this.field357) {
               label129: {
                  if (this.field348 < 0) {
                     if (this.field349 >= var3) {
                        return;
                     }

                     this.field349 = var3 + var3 - 1 - this.field349;
                     this.field348 = -this.field348;
                     if (--this.numLoops == 0) {
                        break label129;
                     }
                  }

                  do {
                     if (this.field349 < var4) {
                        return;
                     }

                     this.field349 = var4 + var4 - 1 - this.field349;
                     this.field348 = -this.field348;
                     if (--this.numLoops == 0) {
                        break;
                     }

                     if (this.field349 >= var3) {
                        return;
                     }

                     this.field349 = var3 + var3 - 1 - this.field349;
                     this.field348 = -this.field348;
                  } while(--this.numLoops != 0);
               }
            } else {
               label161: {
                  int var7;
                  if (this.field348 < 0) {
                     if (this.field349 >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.field349) / var6;
                     if (var7 >= this.numLoops) {
                        this.field349 += var6 * this.numLoops;
                        this.numLoops = 0;
                        break label161;
                     }

                     this.field349 += var6 * var7;
                     this.numLoops -= var7;
                  } else {
                     if (this.field349 < var4) {
                        return;
                     }

                     var7 = (this.field349 - var3) / var6;
                     if (var7 >= this.numLoops) {
                        this.field349 -= var6 * this.numLoops;
                        this.numLoops = 0;
                        break label161;
                     }

                     this.field349 -= var6 * var7;
                     this.numLoops -= var7;
                  }

                  return;
               }
            }
         }

         if (this.field348 < 0) {
            if (this.field349 < 0) {
               this.field349 = -1;
               this.method913();
               this.remove();
            }
         } else if (this.field349 >= var5) {
            this.field349 = var5;
            this.method913();
            this.remove();
         }

      }
   }

   @ObfuscatedName("ao")
   public synchronized void method979(int var1) {
      this.method908(var1 << 6, this.method941());
   }

   @ObfuscatedName("ax")
   synchronized void method907(int var1) {
      this.method908(var1, this.method941());
   }

   @ObfuscatedName("ai")
   synchronized void method908(int var1, int var2) {
      this.field355 = var1;
      this.field350 = var2;
      this.field358 = 0;
      this.method904();
   }

   @ObfuscatedName("ag")
   public synchronized int method909() {
      return this.field355 == Integer.MIN_VALUE ? 0 : this.field355;
   }

   @ObfuscatedName("ah")
   public synchronized int method941() {
      return this.field350 < 0 ? -1 : this.field350;
   }

   @ObfuscatedName("av")
   public synchronized void method911(int var1) {
      int var2 = ((RawSound)super.sound).samples.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.field349 = var1;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Z)V",
      garbageValue = "1"
   )
   public synchronized void method912() {
      this.field348 = (this.field348 ^ this.field348 >> 31) + (this.field348 >>> 31);
      this.field348 = -this.field348;
   }

   @ObfuscatedName("am")
   void method913() {
      if (this.field358 != 0) {
         if (this.field355 == Integer.MIN_VALUE) {
            this.field355 = 0;
         }

         this.field358 = 0;
         this.method904();
      }

   }

   @ObfuscatedName("as")
   public synchronized void method1014(int var1, int var2) {
      this.method915(var1, var2, this.method941());
   }

   @ObfuscatedName("aj")
   public synchronized void method915(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method908(var2, var3);
      } else {
         int var4 = method992(var2, var3);
         int var5 = method899(var2, var3);
         if (var4 == this.field352 && var5 == this.field353) {
            this.field358 = 0;
         } else {
            int var6 = var2 - this.field351;
            if (this.field351 - var2 > var6) {
               var6 = this.field351 - var2;
            }

            if (var4 - this.field352 > var6) {
               var6 = var4 - this.field352;
            }

            if (this.field352 - var4 > var6) {
               var6 = this.field352 - var4;
            }

            if (var5 - this.field353 > var6) {
               var6 = var5 - this.field353;
            }

            if (this.field353 - var5 > var6) {
               var6 = this.field353 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field358 = var1;
            this.field355 = var2;
            this.field350 = var3;
            this.field354 = (var2 - this.field351) / var1;
            this.field347 = (var4 - this.field352) / var1;
            this.field361 = (var5 - this.field353) / var1;
         }
      }
   }

   @ObfuscatedName("ak")
   public synchronized void method916(int var1) {
      if (var1 == 0) {
         this.method907(0);
         this.remove();
      } else if (this.field352 == 0 && this.field353 == 0) {
         this.field358 = 0;
         this.field355 = 0;
         this.field351 = 0;
         this.remove();
      } else {
         int var2 = -this.field351;
         if (this.field351 > var2) {
            var2 = this.field351;
         }

         if (-this.field352 > var2) {
            var2 = -this.field352;
         }

         if (this.field352 > var2) {
            var2 = this.field352;
         }

         if (-this.field353 > var2) {
            var2 = -this.field353;
         }

         if (this.field353 > var2) {
            var2 = this.field353;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field358 = var1;
         this.field355 = Integer.MIN_VALUE;
         this.field354 = -this.field351 / var1;
         this.field347 = -this.field352 / var1;
         this.field361 = -this.field353 / var1;
      }
   }

   @ObfuscatedName("az")
   public synchronized void method917(int var1) {
      if (this.field348 < 0) {
         this.field348 = -var1;
      } else {
         this.field348 = var1;
      }

   }

   @ObfuscatedName("ad")
   public synchronized int method918() {
      return this.field348 < 0 ? -this.field348 : this.field348;
   }

   @ObfuscatedName("ae")
   public boolean method988() {
      return this.field349 < 0 || this.field349 >= ((RawSound)super.sound).samples.length << 8;
   }

   @ObfuscatedName("ap")
   public boolean method1021() {
      return this.field358 != 0;
   }

   @ObfuscatedName("by")
   int method926(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field358 > 0) {
            int var6 = var2 + this.field358;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field358 += var2;
            if (this.field348 == 256 && (this.field349 & 255) == 0) {
               if (PcmPlayer.PcmPlayer_stereo) {
                  var2 = method965(0, ((RawSound)super.sound).samples, var1, this.field349, var2, this.field352, this.field353, this.field347, this.field361, 0, var6, var3, this);
               } else {
                  var2 = method953(((RawSound)super.sound).samples, var1, this.field349, var2, this.field351, this.field354, 0, var6, var3, this);
               }
            } else if (PcmPlayer.PcmPlayer_stereo) {
               var2 = method1032(0, 0, ((RawSound)super.sound).samples, var1, this.field349, var2, this.field352, this.field353, this.field347, this.field361, 0, var6, var3, this, this.field348, var5);
            } else {
               var2 = method914(0, 0, ((RawSound)super.sound).samples, var1, this.field349, var2, this.field351, this.field354, 0, var6, var3, this, this.field348, var5);
            }

            this.field358 -= var2;
            if (this.field358 != 0) {
               return var2;
            }

            if (!this.method928()) {
               continue;
            }

            return var4;
         }

         if (this.field348 == 256 && (this.field349 & 255) == 0) {
            if (PcmPlayer.PcmPlayer_stereo) {
               return method930(0, ((RawSound)super.sound).samples, var1, this.field349, var2, this.field352, this.field353, 0, var4, var3, this);
            }

            return method929(((RawSound)super.sound).samples, var1, this.field349, var2, this.field351, 0, var4, var3, this);
         }

         if (PcmPlayer.PcmPlayer_stereo) {
            return method934(0, 0, ((RawSound)super.sound).samples, var1, this.field349, var2, this.field352, this.field353, 0, var4, var3, this, this.field348, var5);
         }

         return method933(0, 0, ((RawSound)super.sound).samples, var1, this.field349, var2, this.field351, 0, var4, var3, this, this.field348, var5);
      }
   }

   @ObfuscatedName("bn")
   int method927(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field358 > 0) {
            int var6 = var2 + this.field358;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field358 += var2;
            if (this.field348 == -256 && (this.field349 & 255) == 0) {
               if (PcmPlayer.PcmPlayer_stereo) {
                  var2 = method972(0, ((RawSound)super.sound).samples, var1, this.field349, var2, this.field352, this.field353, this.field347, this.field361, 0, var6, var3, this);
               } else {
                  var2 = method939(((RawSound)super.sound).samples, var1, this.field349, var2, this.field351, this.field354, 0, var6, var3, this);
               }
            } else if (PcmPlayer.PcmPlayer_stereo) {
               var2 = method944(0, 0, ((RawSound)super.sound).samples, var1, this.field349, var2, this.field352, this.field353, this.field347, this.field361, 0, var6, var3, this, this.field348, var5);
            } else {
               var2 = method943(0, 0, ((RawSound)super.sound).samples, var1, this.field349, var2, this.field351, this.field354, 0, var6, var3, this, this.field348, var5);
            }

            this.field358 -= var2;
            if (this.field358 != 0) {
               return var2;
            }

            if (!this.method928()) {
               continue;
            }

            return var4;
         }

         if (this.field348 == -256 && (this.field349 & 255) == 0) {
            if (PcmPlayer.PcmPlayer_stereo) {
               return method949(0, ((RawSound)super.sound).samples, var1, this.field349, var2, this.field352, this.field353, 0, var4, var3, this);
            }

            return method931(((RawSound)super.sound).samples, var1, this.field349, var2, this.field351, 0, var4, var3, this);
         }

         if (PcmPlayer.PcmPlayer_stereo) {
            return method936(0, 0, ((RawSound)super.sound).samples, var1, this.field349, var2, this.field352, this.field353, 0, var4, var3, this, this.field348, var5);
         }

         return method935(0, 0, ((RawSound)super.sound).samples, var1, this.field349, var2, this.field351, 0, var4, var3, this, this.field348, var5);
      }
   }

   @ObfuscatedName("bs")
   boolean method928() {
      int var1 = this.field355;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method992(var1, this.field350);
         var3 = method899(var1, this.field350);
      }

      if (var1 == this.field351 && var2 == this.field352 && var3 == this.field353) {
         if (this.field355 == Integer.MIN_VALUE) {
            this.field355 = 0;
            this.field353 = 0;
            this.field352 = 0;
            this.field351 = 0;
            this.remove();
            return true;
         } else {
            this.method904();
            return false;
         }
      } else {
         if (this.field351 < var1) {
            this.field354 = 1;
            this.field358 = var1 - this.field351;
         } else if (this.field351 > var1) {
            this.field354 = -1;
            this.field358 = this.field351 - var1;
         } else {
            this.field354 = 0;
         }

         if (this.field352 < var2) {
            this.field347 = 1;
            if (this.field358 == 0 || this.field358 > var2 - this.field352) {
               this.field358 = var2 - this.field352;
            }
         } else if (this.field352 > var2) {
            this.field347 = -1;
            if (this.field358 == 0 || this.field358 > this.field352 - var2) {
               this.field358 = this.field352 - var2;
            }
         } else {
            this.field347 = 0;
         }

         if (this.field353 < var3) {
            this.field361 = 1;
            if (this.field358 == 0 || this.field358 > var3 - this.field353) {
               this.field358 = var3 - this.field353;
            }
         } else if (this.field353 > var3) {
            this.field361 = -1;
            if (this.field358 == 0 || this.field358 > this.field353 - var3) {
               this.field358 = this.field353 - var3;
            }
         } else {
            this.field361 = 0;
         }

         return false;
      }
   }

   @ObfuscatedName("ba")
   int vmethod1060() {
      int var1 = this.field351 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.numLoops == 0) {
         var1 -= var1 * this.field349 / (((RawSound)super.sound).samples.length << 8);
      } else if (this.numLoops >= 0) {
         var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   @ObfuscatedName("af")
   static int method992(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4) + 0.5);
   }

   @ObfuscatedName("an")
   static int method899(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4) + 0.5);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lbr;II)Lbl;"
   )
   @Export("createRawPcmStream")
   public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
      return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field306 * -1495812544)), var2 << 6) : null;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lbr;III)Lbl;"
   )
   public static RawPcmStream method978(RawSound var0, int var1, int var2, int var3) {
      return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIILbl;)I"
   )
   static int method929(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

      var8.field349 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIILbl;)I"
   )
   static int method930(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

      var10.field349 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIILbl;)I"
   )
   static int method931(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

      var8.field349 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIILbl;)I"
   )
   static int method949(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

      var10.field349 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIILbl;II)I"
   )
   static int method933(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

      var10.field349 = var4;
      return var5;
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILbl;II)I"
   )
   static int method934(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

      var11.field349 = var4;
      return var5 >> 1;
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIILbl;II)I"
   )
   static int method935(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

      var10.field349 = var4;
      return var5;
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILbl;II)I"
   )
   static int method936(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

      var11.field349 = var4;
      return var5 >> 1;
   }

   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIIILbl;)I"
   )
   static int method953(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field352 += var9.field347 * (var6 - var3);
      var9.field353 += var9.field361 * (var6 - var3);

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

      var9.field351 = var4 >> 2;
      var9.field349 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIIIILbl;)I"
   )
   static int method965(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var11 + var4 - var3) > var10) {
         var9 = var10;
      }

      var12.field351 += var12.field354 * (var9 - var4);
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

      var12.field352 = var5 >> 2;
      var12.field353 = var6 >> 2;
      var12.field349 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIIILbl;)I"
   )
   static int method939(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field352 += var9.field347 * (var6 - var3);
      var9.field353 += var9.field361 * (var6 - var3);

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

      var9.field351 = var4 >> 2;
      var9.field349 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIIIILbl;)I"
   )
   static int method972(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field351 += var12.field354 * (var9 - var4);
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

      var12.field352 = var5 >> 2;
      var12.field353 = var6 >> 2;
      var12.field349 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILbl;II)I"
   )
   static int method914(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
      var11.field352 -= var11.field347 * var5;
      var11.field353 -= var11.field361 * var5;
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

      var11.field352 += var11.field347 * var5;
      var11.field353 += var11.field361 * var5;
      var11.field351 = var6;
      var11.field349 = var4;
      return var5;
   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIIIILbl;II)I"
   )
   static int method1032(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
      var13.field351 -= var5 * var13.field354;
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
      var13.field351 += var13.field354 * var5;
      var13.field352 = var6;
      var13.field353 = var7;
      var13.field349 = var4;
      return var5;
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILbl;II)I"
   )
   static int method943(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
      var11.field352 -= var11.field347 * var5;
      var11.field353 -= var11.field361 * var5;
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

      var11.field352 += var11.field347 * var5;
      var11.field353 += var11.field361 * var5;
      var11.field351 = var6;
      var11.field349 = var4;
      return var5;
   }

   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIIIILbl;II)I"
   )
   static int method944(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
      var13.field351 -= var5 * var13.field354;
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
      var13.field351 += var13.field354 * var5;
      var13.field352 = var6;
      var13.field353 = var7;
      var13.field349 = var4;
      return var5;
   }
}
