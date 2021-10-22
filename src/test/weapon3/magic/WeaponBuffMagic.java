package test.weapon3.magic;

import test.weapon3.activity.Attack;
import test.weapon3.activity.Equip;

@Deprecated
public enum WeaponBuffMagic implements WeaponBuffMagicVisitor{
    FLYING {
        @Override
        public void visit(Equip equip) {
            System.out.println("바람을 타고, 하늘을 향해.");
        }

        @Override
        public void visit(Attack attack) {
            System.out.println("폭풍이 몰아치리라!");
        }
    },
    LIFE_STEAL {
        @Override
        public void visit(Equip equip) {
            System.out.println("피 한잔 했으면 좋겠군.");
        }

        @Override
        public void visit(Attack attack) {
            System.out.println("난 피가 부족해!");
        }
    },
    LIGHT {
        @Override
        public void visit(Equip equip) {
            System.out.println("성스러운 빛을 위하여.");
        }

        @Override
        public void visit(Attack attack) {
            System.out.println("빛이 우리와 함께 하리라!");
        }
    },
    NULL {
        @Override
        public void visit(Equip equip) {
            System.out.println("...");
        }

        @Override
        public void visit(Attack attack) {
            System.out.println("공허하다...");
        }
    };

    public static WeaponBuffMagic getDefault() {
        return NULL;
    }

}
