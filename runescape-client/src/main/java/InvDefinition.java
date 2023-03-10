import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("InvDefinition_archive")
   static AbstractArchive InvDefinition_archive;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("InvDefinition_cached")
   static EvictingDualNodeHashTable InvDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("worldMapEvent")
   static WorldMapEvent worldMapEvent;
   @ObfuscatedName("bj")
   static String field1884;
   @ObfuscatedName("op")
   @ObfuscatedSignature(
      descriptor = "Lmy;"
   )
   @Export("mousedOverWidgetIf1")
   static Widget mousedOverWidgetIf1;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -684508907
   )
   @Export("size")
   public int size = 0;

   InvDefinition() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "-667429593"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lsy;II)V",
      garbageValue = "454664689"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 2) {
         this.size = var1.readUnsignedShort();
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;B)V",
      garbageValue = "16"
   )
   static void method3545(Component var0) {
      var0.removeMouseListener(MouseHandler.MouseHandler_instance);
      var0.removeMouseMotionListener(MouseHandler.MouseHandler_instance);
      var0.removeFocusListener(MouseHandler.MouseHandler_instance);
      MouseHandler.MouseHandler_currentButtonVolatile = 0;
   }
}
