import java.awt.Component;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("AABB")
public class AABB {
   @ObfuscatedName("fn")
   @ObfuscatedSignature(
      descriptor = "Lmx;"
   )
   @Export("archive10")
   static Archive archive10;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 532233349
   )
   @Export("xMid")
   int xMid;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -2038217369
   )
   @Export("yMid")
   int yMid;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -2099700903
   )
   @Export("zMid")
   int zMid;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1231347425
   )
   @Export("xMidOffset")
   int xMidOffset;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1061110137
   )
   @Export("yMidOffset")
   int yMidOffset;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -290660215
   )
   @Export("zMidOffset")
   int zMidOffset;

   AABB(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.xMid = var1;
      this.yMid = var2;
      this.zMid = var3;
      this.xMidOffset = var4;
      this.yMidOffset = var5;
      this.zMidOffset = var6;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;I)V",
      garbageValue = "-984780725"
   )
   static void method4546(Component var0) {
      var0.addMouseListener(MouseHandler.MouseHandler_instance);
      var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
      var0.addFocusListener(MouseHandler.MouseHandler_instance);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;Lrz;I)Lrz;",
      garbageValue = "1598994640"
   )
   @Export("readStringIntParameters")
   static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
      int var2 = var0.readUnsignedByte();
      int var3;
      if (var1 == null) {
         var3 = WorldMapLabelSize.method4793(var2);
         var1 = new IterableNodeHashTable(var3);
      }

      for(var3 = 0; var3 < var2; ++var3) {
         boolean var4 = var0.readUnsignedByte() == 1;
         int var5 = var0.readMedium();
         Object var6;
         if (var4) {
            var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
         } else {
            var6 = new IntegerNode(var0.readInt());
         }

         var1.put((Node)var6, (long)var5);
      }

      return var1;
   }
}
