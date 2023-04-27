import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eb")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
   @ObfuscatedName("am")
   @Export("ByteArrayPool_arrays")
   static byte[][][] ByteArrayPool_arrays;
   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("Widget_archive")
   public static AbstractArchive Widget_archive;
   @ObfuscatedName("af")
   @Export("reversed")
   final boolean reversed;

   public UserComparator3(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpb;Lpb;B)I",
      garbageValue = "-10"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (var2.world != var1.world) {
         return this.reversed ? var1.world - var2.world : var2.world - var1.world;
      } else {
         return this.compareUser(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lnm;III)[Ltq;",
      garbageValue = "1271520368"
   )
   public static SpritePixels[] method2923(AbstractArchive var0, int var1, int var2) {
      byte[] var4 = var0.takeFile(var1, var2);
      boolean var3;
      if (var4 == null) {
         var3 = false;
      } else {
         class485.SpriteBuffer_decode(var4);
         var3 = true;
      }

      if (!var3) {
         return null;
      } else {
         SpritePixels[] var5 = new SpritePixels[class503.SpriteBuffer_spriteCount];

         for(int var6 = 0; var6 < class503.SpriteBuffer_spriteCount; ++var6) {
            SpritePixels var7 = var5[var6] = new SpritePixels();
            var7.width = class503.SpriteBuffer_spriteWidth;
            var7.height = class503.SpriteBuffer_spriteHeight;
            var7.xOffset = class503.SpriteBuffer_xOffsets[var6];
            var7.yOffset = class17.SpriteBuffer_yOffsets[var6];
            var7.subWidth = class97.SpriteBuffer_spriteWidths[var6];
            var7.subHeight = class138.SpriteBuffer_spriteHeights[var6];
            int var8 = var7.subHeight * var7.subWidth;
            byte[] var9 = VarbitComposition.SpriteBuffer_pixels[var6];
            var7.pixels = new int[var8];

            for(int var10 = 0; var10 < var8; ++var10) {
               var7.pixels[var10] = class394.SpriteBuffer_spritePalette[var9[var10] & 255];
            }
         }

         class398.method7709();
         return var5;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lsg;II)V",
      garbageValue = "2115875003"
   )
   @Export("readReflectionCheck")
   public static void readReflectionCheck(Buffer var0, int var1) {
      ReflectionCheck var2 = new ReflectionCheck();
      var2.size = var0.readUnsignedByte();
      var2.id = var0.readInt();
      var2.operations = new int[var2.size];
      var2.creationErrors = new int[var2.size];
      var2.fields = new Field[var2.size];
      var2.intReplaceValues = new int[var2.size];
      var2.methods = new Method[var2.size];
      var2.arguments = new byte[var2.size][][];

      for(int var3 = 0; var3 < var2.size; ++var3) {
         try {
            int var4 = var0.readUnsignedByte();
            String var5;
            String var6;
            int var7;
            if (var4 != 0 && var4 != 1 && var4 != 2) {
               if (var4 == 3 || var4 == 4) {
                  var5 = var0.readStringCp1252NullTerminated();
                  var6 = var0.readStringCp1252NullTerminated();
                  var7 = var0.readUnsignedByte();
                  String[] var8 = new String[var7];

                  for(int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.readStringCp1252NullTerminated();
                  }

                  String var20 = var0.readStringCp1252NullTerminated();
                  byte[][] var10 = new byte[var7][];
                  int var12;
                  if (var4 == 3) {
                     for(int var11 = 0; var11 < var7; ++var11) {
                        var12 = var0.readInt();
                        var10[var11] = new byte[var12];
                        var0.readBytes(var10[var11], 0, var12);
                     }
                  }

                  var2.operations[var3] = var4;
                  Class[] var21 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var21[var12] = class33.loadClassFromDescriptor(var8[var12]);
                  }

                  Class var22 = class33.loadClassFromDescriptor(var20);
                  if (class33.loadClassFromDescriptor(var5).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = class33.loadClassFromDescriptor(var5).getDeclaredMethods();
                  Method[] var14 = var13;

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     Method var16 = var14[var15];
                     if (Reflection.getMethodName(var16).equals(var6)) {
                        Class[] var17 = Reflection.getParameterTypes(var16);
                        if (var17.length == var21.length) {
                           boolean var18 = true;

                           for(int var19 = 0; var19 < var21.length; ++var19) {
                              if (var21[var19] != var17[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if (var18 && var22 == var16.getReturnType()) {
                              var2.methods[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.arguments[var3] = var10;
               }
            } else {
               var5 = var0.readStringCp1252NullTerminated();
               var6 = var0.readStringCp1252NullTerminated();
               var7 = 0;
               if (var4 == 1) {
                  var7 = var0.readInt();
               }

               var2.operations[var3] = var4;
               var2.intReplaceValues[var3] = var7;
               if (class33.loadClassFromDescriptor(var5).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.fields[var3] = Reflection.findField(class33.loadClassFromDescriptor(var5), var6);
            }
         } catch (ClassNotFoundException var24) {
            var2.creationErrors[var3] = -1;
         } catch (SecurityException var25) {
            var2.creationErrors[var3] = -2;
         } catch (NullPointerException var26) {
            var2.creationErrors[var3] = -3;
         } catch (Exception var27) {
            var2.creationErrors[var3] = -4;
         } catch (Throwable var28) {
            var2.creationErrors[var3] = -5;
         }
      }

      class36.reflectionChecks.addFirst(var2);
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZI)I",
      garbageValue = "190306276"
   )
   static int method2930(int var0, Script var1, boolean var2) {
      int var4;
      int var9;
      if (var0 == ScriptOpcodes.ADD) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 + var9;
         return 1;
      } else if (var0 == ScriptOpcodes.SUB) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 - var4;
         return 1;
      } else if (var0 == ScriptOpcodes.MULTIPLY) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 * var4;
         return 1;
      } else if (var0 == ScriptOpcodes.DIV) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 / var4;
         return 1;
      } else if (var0 == ScriptOpcodes.RANDOM) {
         var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
         return 1;
      } else if (var0 == ScriptOpcodes.RANDOMINC) {
         var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
         return 1;
      } else {
         int var5;
         int var6;
         int var7;
         if (var0 == ScriptOpcodes.INTERPOLATE) {
            Interpreter.Interpreter_intStackSize -= 5;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
            var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + (var7 - var5) * (var4 - var9) / (var6 - var5);
            return 1;
         } else if (var0 == ScriptOpcodes.ADDPERCENT) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + var9 * var4 / 100;
            return 1;
         } else if (var0 == ScriptOpcodes.SETBIT) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | 1 << var4;
            return 1;
         } else if (var0 == ScriptOpcodes.CLEARBIT) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
            return 1;
         } else if (var0 == ScriptOpcodes.TESTBIT) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.MOD) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 % var4;
            return 1;
         } else if (var0 == ScriptOpcodes.POW) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            if (var9 == 0) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
            }

            return 1;
         } else if (var0 == ScriptOpcodes.INVPOW) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            if (var9 == 0) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               return 1;
            } else {
               switch (var4) {
                  case 0:
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
                     break;
                  case 1:
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9;
                     break;
                  case 2:
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
                     break;
                  case 3:
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
                     break;
                  case 4:
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
                     break;
                  default:
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0 / (double)var4);
               }

               return 1;
            }
         } else if (var0 == ScriptOpcodes.AND) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & var4;
            return 1;
         } else if (var0 == ScriptOpcodes.OR) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4;
            return 1;
         } else if (var0 == 4016) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4;
            return 1;
         } else if (var0 == 4017) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4;
            return 1;
         } else if (var0 == ScriptOpcodes.SCALE) {
            Interpreter.Interpreter_intStackSize -= 3;
            long var10 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            long var12 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            long var14 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(var14 * var10 / var12);
            return 1;
         } else if (var0 == ScriptOpcodes.BITCOUNT) {
            var9 = class18.method289(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9;
            return 1;
         } else if (var0 == ScriptOpcodes.TOGGLEBIT) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 ^ 1 << var4;
            return 1;
         } else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
            Interpreter.Interpreter_intStackSize -= 3;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class134.method3179(var9, var4, var5);
            return 1;
         } else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
            Interpreter.Interpreter_intStackSize -= 3;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Canvas.method331(var9, var4, var5);
            return 1;
         } else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
            Interpreter.Interpreter_intStackSize -= 3;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            var6 = 31 - var5;
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 << var6 >>> var4 + var6;
            return 1;
         } else if (var0 == 4030) {
            Interpreter.Interpreter_intStackSize -= 4;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
            var9 = Canvas.method331(var9, var5, var6);
            var7 = class140.method3220(var6 - var5 + 1);
            if (var4 > var7) {
               var4 = var7;
            }

            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4 << var5;
            return 1;
         } else if (var0 == 4032) {
            Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = AttackOption.method2661(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
            return 1;
         } else if (var0 == 4033) {
            Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = TriBool.method7974(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
            return 1;
         } else if (var0 == 4034) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = UserComparator8.method2890(var9, var4);
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
            return 1;
         } else if (var0 == 4035) {
            Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
            return 1;
         } else if (var0 == 4036) {
            String var3 = Interpreter.Interpreter_stringStack[--SecureRandomCallable.Interpreter_stringStackSize];
            var4 = -1;
            if (WorldMapSectionType.isNumber(var3)) {
               var4 = PacketBufferNode.method5709(var3);
            }

            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4;
            return 1;
         } else {
            return 2;
         }
      }
   }

   @ObfuscatedName("jx")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "76"
   )
   static final int method2932() {
      if (class20.clientPreferences.method2513()) {
         return GameEngine.Client_plane;
      } else {
         int var0 = 3;
         if (WorldMapSectionType.cameraPitch < 310) {
            int var1;
            int var2;
            if (Client.oculusOrbState == 1) {
               var1 = class33.oculusOrbFocalPointX >> 7;
               var2 = class144.oculusOrbFocalPointY >> 7;
            } else {
               var1 = MusicPatchNode.localPlayer.x >> 7;
               var2 = MusicPatchNode.localPlayer.y >> 7;
            }

            int var3 = class36.cameraX >> 7;
            int var4 = class297.cameraZ >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
               return GameEngine.Client_plane;
            }

            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
               return GameEngine.Client_plane;
            }

            if ((Tiles.Tiles_renderFlags[GameEngine.Client_plane][var3][var4] & 4) != 0) {
               var0 = GameEngine.Client_plane;
            }

            int var5;
            if (var1 > var3) {
               var5 = var1 - var3;
            } else {
               var5 = var3 - var1;
            }

            int var6;
            if (var2 > var4) {
               var6 = var2 - var4;
            } else {
               var6 = var4 - var2;
            }

            int var7;
            int var8;
            if (var5 > var6) {
               var7 = var6 * 65536 / var5;
               var8 = 32768;

               while(var1 != var3) {
                  if (var3 < var1) {
                     ++var3;
                  } else if (var3 > var1) {
                     --var3;
                  }

                  if ((Tiles.Tiles_renderFlags[GameEngine.Client_plane][var3][var4] & 4) != 0) {
                     var0 = GameEngine.Client_plane;
                  }

                  var8 += var7;
                  if (var8 >= 65536) {
                     var8 -= 65536;
                     if (var4 < var2) {
                        ++var4;
                     } else if (var4 > var2) {
                        --var4;
                     }

                     if ((Tiles.Tiles_renderFlags[GameEngine.Client_plane][var3][var4] & 4) != 0) {
                        var0 = GameEngine.Client_plane;
                     }
                  }
               }
            } else if (var6 > 0) {
               var7 = var5 * 65536 / var6;
               var8 = 32768;

               while(var4 != var2) {
                  if (var4 < var2) {
                     ++var4;
                  } else if (var4 > var2) {
                     --var4;
                  }

                  if ((Tiles.Tiles_renderFlags[GameEngine.Client_plane][var3][var4] & 4) != 0) {
                     var0 = GameEngine.Client_plane;
                  }

                  var8 += var7;
                  if (var8 >= 65536) {
                     var8 -= 65536;
                     if (var3 < var1) {
                        ++var3;
                     } else if (var3 > var1) {
                        --var3;
                     }

                     if ((Tiles.Tiles_renderFlags[GameEngine.Client_plane][var3][var4] & 4) != 0) {
                        var0 = GameEngine.Client_plane;
                     }
                  }
               }
            }
         }

         if (MusicPatchNode.localPlayer.x >= 0 && MusicPatchNode.localPlayer.y >= 0 && MusicPatchNode.localPlayer.x < 13312 && MusicPatchNode.localPlayer.y < 13312) {
            if ((Tiles.Tiles_renderFlags[GameEngine.Client_plane][MusicPatchNode.localPlayer.x >> 7][MusicPatchNode.localPlayer.y >> 7] & 4) != 0) {
               var0 = GameEngine.Client_plane;
            }

            return var0;
         } else {
            return GameEngine.Client_plane;
         }
      }
   }
}
