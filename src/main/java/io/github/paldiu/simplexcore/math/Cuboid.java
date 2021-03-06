package io.github.paldiu.simplexcore.math;

import io.github.paldiu.simplexcore.utils.Constants;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.scheduler.BukkitTask;

import java.util.function.Consumer;

public final class Cuboid {
    private final int x, y, z;

    public Cuboid() {
        this(3, 3, 3);
    }

    public Cuboid(int xSize, int ySize, int zSize) {
        this.x = xSize;
        this.y = ySize;
        this.z = zSize;
    }

    public Cuboid(Size size) {
        this(size.getX(), size.getY(), size.getZ());
    }

    public void generate(Location location, Material material) {
        Consumer<BukkitTask> task = bukkitTask -> {
            int t1 = location.getBlockX();
            int t2 = location.getBlockY();
            int t3 = location.getBlockZ();

            int a = t1 + x;
            int b = t2 + y;
            int c = t3 + z;

            while (t1 < a) {
                while (t2 < b) {
                    while (t3 < c) {
                        t3++;
                        location.getWorld().getBlockAt(t1, t2, t3).setType(material);
                    }
                    t2++;
                }
                t1++;
            }
        };

        Constants.getScheduler().runTaskLaterAsynchronously(Constants.getPlugin(), task, Constants.getTimeValues().SECOND());
    }
}
