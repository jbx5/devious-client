import java.awt.Component;
import java.awt.Graphics;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
   @ObfuscatedName("vt")
   static Iterator field139;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lrg;"
   )
   static IndexedSprite field140;
   @ObfuscatedName("fl")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   static Archive field132;
   @ObfuscatedName("ff")
   @ObfuscatedGetter(
      intValue = -1716936607
   )
   static int field138;
   @ObfuscatedName("f")
   @Export("component")
   Component component;

   Canvas(Component var1) {
      this.component = var1;
   }

   public final void update(Graphics var1) {
      this.component.update(var1);
   }

   public final void paint(Graphics var1) {
      this.component.paint(var1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)[Ljw;",
      garbageValue = "-68"
   )
   static LoginPacket[] method325() {
      return new LoginPacket[]{LoginPacket.field3309, LoginPacket.field3316, LoginPacket.field3317, LoginPacket.field3310, LoginPacket.field3311, LoginPacket.field3312};
   }
}
