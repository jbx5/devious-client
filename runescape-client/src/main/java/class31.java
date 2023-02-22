import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
public class class31 {
   @ObfuscatedName("aj")
   public static Applet field166 = null;
   @ObfuscatedName("al")
   public static String field161 = "";
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = 803191375
   )
   static int field167;
   @ObfuscatedName("iz")
   @ObfuscatedGetter(
      intValue = -1643583259
   )
   static int field164;

   @ObfuscatedName("le")
   @ObfuscatedSignature(
      descriptor = "([Lmy;IB)V",
      garbageValue = "108"
   )
   @Export("drawModelComponents")
   static final void drawModelComponents(Widget[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         Widget var3 = var0[var2];
         if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !WallDecoration.isComponentHidden(var3))) {
            int var5;
            if (var3.type == 0) {
               if (!var3.isIf3 && WallDecoration.isComponentHidden(var3) && var3 != InvDefinition.mousedOverWidgetIf1) {
                  continue;
               }

               drawModelComponents(var0, var3.id);
               if (var3.children != null) {
                  drawModelComponents(var3.children, var3.id);
               }

               InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
               if (var4 != null) {
                  var5 = var4.group;
                  if (GrandExchangeEvent.loadInterface(var5)) {
                     drawModelComponents(class155.Widget_interfaceComponents[var5], -1);
                  }
               }
            }

            if (var3.type == 6) {
               if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
                  boolean var8 = JagexCache.runCs1(var3);
                  if (var8) {
                     var5 = var3.sequenceId2;
                  } else {
                     var5 = var3.sequenceId;
                  }

                  if (var5 != -1) {
                     SequenceDefinition var6 = Coord.SequenceDefinition_get(var5);
                     if (!var6.isCachedModelIdSet()) {
                        for(var3.modelFrameCycle += Client.graphicsCycle; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class69.invalidateWidget(var3)) {
                           var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
                           ++var3.modelFrame;
                           if (var3.modelFrame >= var6.frameIds.length) {
                              var3.modelFrame -= var6.frameCount;
                              if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) {
                                 var3.modelFrame = 0;
                              }
                           }
                        }
                     } else {
                        var3.modelFrame += Client.graphicsCycle;
                        int var7 = var6.method4015();
                        if (var3.modelFrame >= var7) {
                           var3.modelFrame -= var6.frameCount;
                           if (var3.modelFrame < 0 || var3.modelFrame >= var7) {
                              var3.modelFrame = 0;
                           }
                        }

                        class69.invalidateWidget(var3);
                     }
                  }
               }

               if (var3.field3582 != 0 && !var3.isIf3) {
                  int var9 = var3.field3582 >> 16;
                  var5 = var3.field3582 << 16 >> 16;
                  var9 *= Client.graphicsCycle;
                  var5 *= Client.graphicsCycle;
                  var3.modelAngleX = var9 + var3.modelAngleX & 2047;
                  var3.modelAngleY = var5 + var3.modelAngleY & 2047;
                  class69.invalidateWidget(var3);
               }
            }
         }
      }

   }

   @ObfuscatedName("mj")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-3"
   )
   static final void method445() {
      Client.field525 = Client.cycleCntr;
      class18.ClanChat_inClanChat = true;
   }
}
