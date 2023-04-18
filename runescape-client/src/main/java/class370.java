import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
public class class370 {
   @ObfuscatedName("af")
   static char[] field4377 = new char[64];
   @ObfuscatedName("an")
   static char[] field4375;
   @ObfuscatedName("aw")
   static char[] field4376;
   @ObfuscatedName("ac")
   static int[] field4378;
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "[Lsj;"
   )
   @Export("JagexCache_idxFiles")
   public static BufferedFile[] JagexCache_idxFiles;

   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         field4377[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field4377[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field4377[var0] = (char)(var0 + 48 - 52);
      }

      field4377[62] = '+';
      field4377[63] = '/';
      field4375 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field4375[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field4375[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field4375[var0] = (char)(var0 + 48 - 52);
      }

      field4375[62] = '*';
      field4375[63] = '-';
      field4376 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field4376[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field4376[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field4376[var0] = (char)(var0 + 48 - 52);
      }

      field4376[62] = '-';
      field4376[63] = '_';
      field4378 = new int[128];

      for(var0 = 0; var0 < field4378.length; ++var0) {
         field4378[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         field4378[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         field4378[var0] = var0 - 97 + 26;
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         field4378[var0] = var0 - 48 + 52;
      }

      int[] var2 = field4378;
      field4378[43] = 62;
      var2[42] = 62;
      int[] var1 = field4378;
      field4378[47] = 63;
      var1[45] = 63;
   }

   @ObfuscatedName("mm")
   @ObfuscatedSignature(
      descriptor = "(Lmq;III)V",
      garbageValue = "-1880681871"
   )
   @Export("clickWidget")
   static final void clickWidget(Widget var0, int var1, int var2) {
      if (Client.clickedWidget == null && !Client.isMenuOpen) {
         if (var0 != null) {
            Widget var5 = var0;
            int var6 = StructComposition.method3940(KeyHandler.getWidgetFlags(var0));
            Widget var4;
            int var7;
            if (var6 == 0) {
               var4 = null;
            } else {
               var7 = 0;

               while(true) {
                  if (var7 >= var6) {
                     var4 = var5;
                     break;
                  }

                  var5 = class165.getWidget(var5.parentId);
                  if (var5 == null) {
                     var4 = null;
                     break;
                  }

                  ++var7;
               }
            }

            Widget var8 = var4;
            if (var4 == null) {
               var8 = var0.parent;
            }

            if (var8 != null) {
               Client.clickedWidget = var0;
               var5 = var0;
               var6 = StructComposition.method3940(KeyHandler.getWidgetFlags(var0));
               if (var6 == 0) {
                  var4 = null;
               } else {
                  var7 = 0;

                  while(true) {
                     if (var7 >= var6) {
                        var4 = var5;
                        break;
                     }

                     var5 = class165.getWidget(var5.parentId);
                     if (var5 == null) {
                        var4 = null;
                        break;
                     }

                     ++var7;
                  }
               }

               var8 = var4;
               if (var4 == null) {
                  var8 = var0.parent;
               }

               Client.clickedWidgetParent = var8;
               Client.widgetClickX = var1;
               Client.widgetClickY = var2;
               class96.widgetDragDuration = 0;
               Client.isDraggingWidget = false;
               int var9 = DynamicObject.method2142();
               if (var9 != -1) {
                  class287.method5689(var9);
               }

               return;
            }
         }

      }
   }
}
