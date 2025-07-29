class Solution {
public:
    int heightChecker(vector<int>& heights) {
        int x=0;
        vector<int> ss;
        int y=heights.size();
        for(int i=0; i < y; i++){
            int z=heights[i];
            ss.push_back(z);
        }
        sort(ss.begin(), ss.end());
        for(int j=0; j<y; j++){
            if(heights[j]!=ss[j]) x++;
        }
        return x;
    }
};