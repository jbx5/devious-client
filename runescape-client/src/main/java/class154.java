import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("fp")
public class class154 extends class140 {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -2071349373
   )
   int field1728;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfo;"
   )
   final class143 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfo;)V"
   )
   class154(class143 var1) {
      this.this$0 = var1;
      this.field1728 = -1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "-1979280996"
   )
   void vmethod3361(Buffer var1) {
      this.field1728 = var1.readUnsignedShort();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lfi;B)V",
      garbageValue = "29"
   )
   void vmethod3362(ClanSettings var1) {
      var1.method3203(this.field1728);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsy;II)V",
      garbageValue = "-1972796203"
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
                     var21[var12] = BufferedFile.loadClassFromDescriptor(var8[var12]);
                  }

                  Class var22 = BufferedFile.loadClassFromDescriptor(var20);
                  if (BufferedFile.loadClassFromDescriptor(var5).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = BufferedFile.loadClassFromDescriptor(var5).getDeclaredMethods();
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
               if (BufferedFile.loadClassFromDescriptor(var5).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.fields[var3] = Reflection.findField(BufferedFile.loadClassFromDescriptor(var5), var6);
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

   @ObfuscatedName("lv")
   @ObfuscatedSignature(
      descriptor = "(IIIIIB)V",
      garbageValue = "0"
   )
   @Export("drawScrollBar")
   static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
      AbstractWorldMapData.scrollBarSprites[0].drawAt(var0, var1);
      AbstractWorldMapData.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field556);
      int var5 = var3 * (var3 - 32) / var4;
      if (var5 < 8) {
         var5 = 8;
      }

      int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
      Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field555);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field559);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field559);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field559);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field559);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field558);
      Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field558);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var5 + var1 + 15, 16, Client.field558);
      Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field558);
   }

   @ObfuscatedName("ne")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
      garbageValue = "115"
   )
   static String method3285(String var0, boolean var1) {
      String var2 = var1 ? "https://" : "http://";
      if (Client.gameBuild == 1) {
         var0 = var0 + "-wtrc";
      } else if (Client.gameBuild == 2) {
         var0 = var0 + "-wtqa";
      } else if (Client.gameBuild == 3) {
         var0 = var0 + "-wtwip";
      } else if (Client.gameBuild == 5) {
         var0 = var0 + "-wti";
      } else if (Client.gameBuild == 4) {
         var0 = "local";
      }

      String var3 = "";
      if (FontName.field4790 != null) {
         var3 = "/p=" + FontName.field4790;
      }

      String var4 = "runescape.com";
      return var2 + var0 + "." + var4 + "/l=" + class69.clientLanguage + "/a=" + RouteStrategy.field2330 + var3 + "/";
   }
}
