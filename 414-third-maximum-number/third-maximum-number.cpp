#include <vector>
#include <set>
#include <algorithm>
using namespace std;

class Solution {
public:
    int thirdMax(vector<int>& nums) {
        set<int> s(nums.begin(), nums.end());
        vector<int> v(s.begin(), s.end());
        sort(v.begin(), v.end(), greater<int>());
        return v.size() >= 3 ? v[2] : v[0];
    }
};
